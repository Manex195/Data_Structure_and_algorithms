// queue using linked list.
public class queue {
    private class Node {
        int element;
        Node next;
    }
    private Node first, last;
    public boolean isEmpty() {
        return first == null;
    }
    public void enQueue(int element) {
        Node oldLast = last;
        last = new Node();
        last.element = element;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
    }
    public int deQueue() {
        int element = first.element;
        first = first.next;
        if (isEmpty()) last = null;
        return element;
    }
}
