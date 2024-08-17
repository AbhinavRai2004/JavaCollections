package CollectionsPackage;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push("abhinav");
        stk.push(100);
        stk.push(200.00);

        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.empty());
        System.out.println(stk.search("abhinav")); // index starts with 1.
    }
}
