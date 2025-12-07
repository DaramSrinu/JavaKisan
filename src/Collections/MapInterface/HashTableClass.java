package Collections.MapInterface;

import java.util.*;

public class HashTableClass {
    void meth1() {
        System.out.println("Implementing TreeMap Class");
        Hashtable<Object, Object> map = new Hashtable<>();
        map.put(10, "India");    // Insertion order is not maintained
        map.put("Russia",800);  // Heterogeneous keys are allowed & Heterogeneous values are allowed
        //map.put(null,null); // Null keys are not allowed &  null values are not allowed
        map.put(56, "America");  // Duplicate keys & Duplicate Values are allowed(Only one key will be present in the TreeMap)
        map.put(1, "Japan");   // It is available from Java 1.0V (It is legacy class)
        map.put(99, "Paris");  // Default capacity is 16, Load factor is 0.75, Size Increases by double
        map.put(45, "Malaysia"); // It is  Synchronized by default
        System.out.println(map);
        System.out.println("-----------------");
        System.out.println("Retrieving the data by using HashSet (Insertion order will not be maintained)");
        HashSet<Object> hs1 = new HashSet<>(map.entrySet());
        Iterator i1 = hs1.iterator();
        while (i1.hasNext()) {
            //System.out.println(i1.next());
            Map.Entry e = (Map.Entry) i1.next();
            System.out.println(e.getKey() + "  " + e.getValue());
        }
        System.out.println("-----------------------------------");
        System.out.println("Retrieving the data by using HashSet (Insertion order will be maintained)");
        LinkedHashSet<Object> hs2 = new LinkedHashSet<>(map.entrySet());
        Iterator i2 = hs2.iterator();
        while (i2.hasNext()) {
            //System.out.println(i1.next());
            Map.Entry e = (Map.Entry) i2.next();
            System.out.println(e.getKey() + "  " + e.getValue());
        }
    }
    public static void main(String[] args) {
        new HashTableClass().meth1();
    }
    }
