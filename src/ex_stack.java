import java.util.Iterator;
// linked list stack
// as we are using generics we have to user wrapper object.
// for int it is Integer ex: ex_stack.push(new Integer(x))
// int a = ex_stack.pop().intValue();
public class ex_stack<T> implements Iterable<T> {
    public Iterator<T> iterator() { return new ListIterator(); }

    private class ListIterator implements Iterator<T> {
        private Node current = first;
        public boolean hasNext() { return current != null; }
        public void remove() { }
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
    private Node first = null;
    private class Node {
        T item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
    public T pop() {
        T item = first.item;
        first = first.next;
        return item;
    }
}
// can be used generic class as well
// but the problem is we need to cast type or ugly cast.
// because java doesn't allow generic array creation.
class ArrayStack<T> implements Iterable<T> {
    private T[] s;
    private int N = 0;
    // if we user generics.
    public ArrayStack(int capacity) {
        s = (T[]) new Object[capacity];
    }
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<T> {
        private int i = N;
        public boolean hasNext() { return i > 0; }
        public void remove() { /* If needed */ }
        public T next() { return s[--i]; }
    }

    public boolean isEmpty() {
        return N == 0;
    }
    public void push(T item) {
        s[N++] = item;
    }
    public T pop() {
        return s[--N];
    }
}
// can be generics as well.
// same as ArrayStack.
class ResizingArrayStack {
    private String[] s;
    private int N = 0;
    public void push(String element) {
        if (N == s.length) resize(2 * s.length);
        s[N++] = element;
    }

    private void resize(int capacity) {
        String[] copyArr = new String[capacity];
        for (int i = 0; i < N; i++) {
            copyArr[i] = s[i];
        }
        s = copyArr;
    }
    public String pop() {
        String element = s[--N];
        s[N] = null;
        if (N > 0 && N == s.length / 4) resize(s.length / 2);
        return element;
    }
}

