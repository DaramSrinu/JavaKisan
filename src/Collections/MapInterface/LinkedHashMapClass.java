package Collections.MapInterface;

import java.util.*;

public class LinkedHashMapClass {
    void meth1(){
        System.out.println("Implementing LinkedHashMap Class");
        LinkedHashMap<Object,Object> map = new LinkedHashMap<>();
        map.put(101,"Java");  // Insertion order is maintained
        map.put("Java",500);  // Heterogeneous key is allowed & Heterogeneous value is allowed
        map.put(null,null);   // null key is allowed & null value is allowed
        map.put(103,"SpringFramework");  // Duplicates values are allowed
        map.put(102,"SQL");            // It is available from Java 1.4V
        map.put(104,"Hibernate");       // Default Capacity : 16, Load Factor is 0.75, size increases by DOUBLE
        map.put(105,"JPA");            // It is not Synchronized
        System.out.println(map);
        map.put(102,"Oracle");
        System.out.println(map);
        map.put(104,"JPA");
        System.out.println(map);
        System.out.println("Retrieving the data  by using key from LinkedHashMap : " + map.get("Java")); // 500
        System.out.println(map.get(103)); // SpringFramework
        System.out.println("Retrieving the keys from LinkedHashMap");
        LinkedHashSet<Object> hs1 = new LinkedHashSet<>(map.keySet());
        Iterator<Object> i1 = hs1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("Retrieving the key-value pairs from LinkedHashmap");
        LinkedHashSet<Object> hs2 = new LinkedHashSet<>(map.entrySet());
        Iterator<Object> i2 = hs2.iterator();
        while(i2.hasNext()){
            //System.out.println(i2.next());
            Map.Entry e = (Map.Entry)i2.next();
            System.out.println(e.getKey() + "  " + e.getValue());
        }
    }
    public static void main(String[] args) {
        new LinkedHashMapClass().meth1();
    }
}
