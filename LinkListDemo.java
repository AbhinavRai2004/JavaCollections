package CollectionsPackage;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList ll1 = new LinkedList(ll);
        ll.add("Abhinav");
        ll.add(100);
        ll.add(10.2);
        ll.add("rahul");

        ll.addFirst(500);
        ll.addLast(800);

        System.out.println(ll.removeFirst());

        System.out.println(ll.getFirst());

        System.out.println(ll);
    }
}
