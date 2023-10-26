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
        queue q = new queue();
        q.enQueue(5);
        q.enQueue(12);
        q.enQueue(25);
        System.out.println(q.deQueue());
    }
}