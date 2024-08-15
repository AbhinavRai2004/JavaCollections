package CollectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
         List l = new ArrayList();
         l.add(10);
         l.add(1,20);
         l.add(null);
         l.add(null);
//         l.add(3,30); // give error.

//        Iterator itr = l.iterator();
//        // 1. hasNext() --> boolean.
//        // 2. next().
//        // 3. remove().
//
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        System.out.println(l);

        ListIterator litr = l.listIterator();

        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }
    }
}