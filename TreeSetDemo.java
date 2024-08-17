package CollectionsPackage;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(50);
        ts.add(20);
        ts.add(900);
        ts.add(100);
        ts.add(10);

        TreeSet ts1 = new TreeSet(ts);
//        ts.clear();
//        ts.remove(20);

        System.out.println(ts);
    }
}
