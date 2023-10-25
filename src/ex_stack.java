// linked list stack
class ex_stack {
    private Node first = null;
    private class Node {
        String item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}

class ArrayStack {
    private String[] s;
    private int N = 0;
    public ArrayStack(int n) {
        s = new String[n];
    }
    public boolean isEmpty() {
        return N == 0;
    }
    public void push(String item) {
        s[N++] = item;
    }
    public String pop() {
        return s[--N];
    }
}

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

