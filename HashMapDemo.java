package CollectionsPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hmp = new HashMap(); // initialCapacity = 16, loadFactor = 0.75
//        HashMap hmp = new HashMap(2,4);
        hmp.put(1,"abhi");
        hmp.put(2,"amit");
        hmp.put(3,"anupam");
        hmp.put(4,"akash");

        for (Map.Entry itr : hmp.entrySet())
        {
            System.out.println(itr.getKey() + "->" + itr.getValue());
        }

        System.out.println(hmp.size());

//        hmp.remove(2,"amit");
//        hmp.remove(3);
//        hmp.replace(2,"anup");
//        System.out.println(hmp.containsKey(2));
//        System.out.println(hmp);
//        System.out.println(hmp.get(3));


//        Set st = hmp.entrySet();
//        System.out.println(hmp);
//        System.out.println(st);
//
//        Iterator itr = st.iterator();
//
//        while(itr.hasNext()){
////            System.out.println(itr.next());
//            Map.Entry en = (Map.Entry) itr.next();
//            System.out.println(en.getKey() + " -> " + en.getValue());
//        }
    }
}
