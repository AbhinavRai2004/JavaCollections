package CollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(11); // present is instance of object class.
        hs.add(5);
        hs.add("Abhinav");
        hs.add("xyz");
        hs.add(11);

        System.out.println(hs);

        Iterator it = hs.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
