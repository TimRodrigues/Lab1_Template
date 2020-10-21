package pt.pa.adts;

/**
 *
 * Implementacao de fila ({@link Queue}) baseado em linked list
 *
 * @param <T> elemento a armazenar
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;

    public QueueLinkedList() {
        this.header = new Node(null, null, null);
        this.trailer = new Node(null, null, null);

        this.header.next = this.trailer;
        this.trailer.prev = this.header;

        this.size = 0;
    }

    @Override
    public void enqueue(T element) throws FullQueueException {
        //O(1)
        try {
            Node newNode = new Node(element, trailer.prev, null);
            trailer.prev.next = newNode;
            trailer.prev = newNode;
            this.size++;
        } catch(OutOfMemoryError e) {
            throw new FullQueueException("No memory for more elements");
        }

    }

    @Override
    public T dequeue() throws EmptyQueueException {

        if(isEmpty()) throw new EmptyQueueException();

        T element = header.next.element;
        header.next = header.next.next;

        this.size--;

        return element;
    }

    @Override
    public boolean isEmpty() {
        return header.next == null;
    }

    @Override
    public T front() throws EmptyQueueException {
        if(isEmpty()) throw new EmptyQueueException();

        return header.next.element;
    }

    @Override
    public void clear() {
        this.header.next = null;
        this.trailer.prev = null;
        this.size = 0;
    }

    @Override
    public int size() {
        //O(1)
        return this.size;

        //O(n)
        /*
        int counter = 0;
        Node current = header.next;
        while(current != null) {
            counter++;
            current = current.next;
        }
        return counter;
         */
    }

    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node prev, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
