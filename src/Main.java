import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex_stack theStack = new ex_stack();
        theStack.push("Hello");
        theStack.push("greetings");
        System.out.println(theStack.pop());
    }
}