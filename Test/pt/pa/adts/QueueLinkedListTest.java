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
        assertEquals(1, queue.dequeue());
    }

    @Test
    void dequeue() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void front() {
    }

    @Test
    void clear() {
    }

    @Test
    void size() {
    }
}