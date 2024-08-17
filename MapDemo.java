package CollectionsPackage;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map mp = new HashMap();

        mp.put(101,"deepak");
        mp.put(102,"riti");
        mp.put(103,"rahul");
        mp.put(null,null);

//        mp.clear();
//        System.out.println(mp.containsKey(103));
//        System.out.println(mp.containsValue("ab"));
//        System.out.println(mp.get(102));
//        System.out.println(mp);
//        System.out.println(mp.entrySet());

        mp.replace(102,"abhinav");
        System.out.println(mp.size());
    }
}
