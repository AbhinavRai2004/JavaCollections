package CollectionsPackage;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList(); // creates arraylist of capacity 10.
//        ArrayList al = new ArrayList(6); // creates a arraylist with capacity 6.
        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(30);

        ArrayList al1 = new ArrayList(al2);  // creates a arraylist containing elements of al2.
        // some imp methods

        al1.add('c');
        al1.add(4,200); //better way
        al1.add(10);
        al1.add(null);
        al1.add(null);

        System.out.println(al1);
        al1.remove(2);
        al1.remove("c");
        System.out.println(al1.get(0));
        System.out.println(al1.contains(10));
        al1.set(2,44);
        System.out.println(al1.indexOf(null));
        System.out.println(al1.size());
        System.out.println(al1);


    }
}
