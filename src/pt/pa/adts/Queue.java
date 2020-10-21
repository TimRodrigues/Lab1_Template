package pt.pa.adts;

/**
 * Interface que define o comportamento de uma fila na linguagem Java.
 *
 * Uma fila é um contentor de elementos que garante uma politica de acesso FIFO
 *
 * @param <T> tipo de elemento a armazenar na fila
 */
public interface Queue<T> {

    /**
     * Insere o elemento <i>element</i> no trailer da fila.
     *
     * @param element elemento a inserir
     *
     * @throws FullQueueException se nao houver capacidade/memoria para mais elementos.
     */
    public void enqueue(T element) throws FullQueueException;

    /**
     * Verifica se a fila se encontra vazia
     *
     * @return se a fila se encontra vazia em boolean
     */
    public boolean isEmpty();

    /**
     * Remove o elemento no header da fila
     *
     * @return o elemento no header da fila
     *
     * @throws EmptyQueueException se a fila estiver vazia
     */
    public T dequeue() throws EmptyQueueException;

    /**
     * Inspeciona o elemento no header da fila
     *
     * @return o elemento no header da fila
     *
     * @throws EmptyQueueException se a fila estiver vazia
     */
    public T front() throws EmptyQueueException;

    /**
     * Limpar a fila ao definir os elementos a null
     */
    public void clear();

    /**
     * Verifica a quantidade de elementos dentro da fila
     *
     * @return quantidade de elementos dentro da fila
     */
    public int size();
}
