package CollectionsPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {
    public static void main(String[] args)
    {
        List l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        ListIterator litr = l1.listIterator();

        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }
        System.out.println("----------------------------------------------");

        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
//        litr.add(100);
        
        litr.set(200);
        System.out.println(l1);
    }
}
