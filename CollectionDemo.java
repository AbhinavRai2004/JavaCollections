package CollectionsPackage;

import java.util.ArrayList;

//import java.util.Collection;
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al =  new ArrayList();
        ArrayList al1 =  new ArrayList();
        al.add(29);
        al.add(10);
        al1.add(40);
        al1.add(50);
        al.addAll(al1);

        System.out.println(al);
        System.out.println(al.contains(10));
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.remove(0));
        System.out.println(al.removeAll(al1));
        al.clear();
        System.out.println(al);

    }
}
