import java.util.Iterator;

// queue using linked list.
public class queue<T> implements Iterable<T> {
    public Iterator<T> iterator() { return new QIterator(); }
    private class QIterator implements Iterator<T> {
        private Node current = first;
        public boolean hasNext() { return current != null; }
        public void remove() { /* if needed */ }
        public T next() {
            T item = current.element;
            current = current.next;
            return item;
        }
    }
    private class Node {
        T element;
        Node next;
    }
    private Node first, last;
    public boolean isEmpty() {
        return first == null;
    }
    public void enQueue(T element) {
        Node oldLast = last;
        last = new Node();
        last.element = element;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
    }
    public T deQueue() {
        T element = first.element;
        first = first.next;
        if (isEmpty()) last = null;
        return element;
    }
}


class ArrayQueue<T> implements Iterable<T> {
    private T[] Qarr;
    private int N;
    private int F;
    public Iterator<T> iterator() { return new ArrayQueueIterator(); }

    private class ArrayQueueIterator implements Iterator<T> {
        private int curr = F;
        public boolean hasNext() { return curr != N; }
        public void remove() { /* If we need to */ }
        public T next() {
            return Qarr[++curr];
        }
    }
    public ArrayQueue(int capacity) {
        Qarr = (T[]) new Object[capacity];
        N = F = -1;
    }
    public boolean isEmpty() {
        return N == F;
    }
    public void push(T item) {
        Qarr[++N] = item;
    }
    public T pop() {
        return Qarr[++F];
    }
}
