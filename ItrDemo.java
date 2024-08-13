package CollectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {
    public static void main(String[] argfs)
    {
        List l = new ArrayList();
        l.add(10);
        l.add("abhinav");
        l.add("Anjali");
        System.out.println(l);

        Iterator it = l.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
