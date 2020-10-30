package pt.pa.adts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueLinkedListTest {

    private Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new QueueLinkedList<>();
    }

    @Test
    void enqueue() {
        assertEquals(0, queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    void dequeue() {
        assertEquals(0, queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        assertEquals(1, queue.size());
    }

    @Test
    void isEmpty() {
        assertEquals(true, queue.isEmpty());
        queue.enqueue(1);
        assertEquals(false, queue.isEmpty());
    }

    @Test
    void front() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.front());
    }

    @Test
    void clear() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
        queue.clear();
        assertEquals(0, queue.size());
    }

    @Test
    void size() {
        assertEquals(0, queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }
}