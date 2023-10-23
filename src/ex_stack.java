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



