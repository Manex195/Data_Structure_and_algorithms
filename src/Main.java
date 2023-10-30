public class Main {
    public static void main(String[] args) {
        // stack test...
        ArrayStack<String> theStack = new ArrayStack<String>(10);
        theStack.push("Hello");
        theStack.push("greetings");
        for (String s : theStack) {
            System.out.println(s);
        }
        // queue test...
        queue<Integer> q = new queue<Integer>();
        q.enQueue(new Integer(5));
        q.enQueue(new Integer(12));
        q.enQueue(new Integer(25));
        System.out.println(q.deQueue());
        for (Integer w : q) {
            System.out.println(w);
        }
        // queue using array...
        ArrayQueue<Integer> aq = new ArrayQueue<Integer>(10);
        aq.push(new Integer(5));
        aq.push(new Integer(12));
        aq.push(new Integer(25));
        for (Integer a : aq) {
            System.out.println(a);
        }
    }
}