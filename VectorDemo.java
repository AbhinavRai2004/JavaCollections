package CollectionsPackage;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        Vector v = new Vector();   // initial capacity 10.
          Vector v = new Vector(6); // initial capacity 20.
          Vector v1 = new Vector(10,3);  // initial capacity 10 and increament will be 3 times.

          v.add(10);
          v.add(1,"Abhi");
          v.add(null);
          v.addElement(100);
          v.add(null);
          v.add("Abravihi");
          v.add(1000);
          v.add(3000);

        System.out.println(v.removeElement("Abhi"));
        System.out.println(v.lastElement());
        System.out.println(v.capacity());
    }
}
