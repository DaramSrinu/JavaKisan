package Collections.MapInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {
    void meth1(){
        System.out.println("Implementing Hash Map");
        HashMap<Object,Object> map = new HashMap<>();
        map.put(101,"Java");  // Insertion order is not maintained
        map.put("Java",500);  // Heterogeneous key is allowed & Heterogeneous value is allowed
        map.put(null,null);   // null key is allowed & null value is allowed
        map.put(103,"SpringFramework");  // Duplicates values are allowed
        map.put(102,"SQL");            // It is available from Java 1.2V
        map.put(104,"Hibernate");       // Default Capacity : 16, Load Factor is 0.75, size increases by DOUBLE
        map.put(105,"JPA");            // It is not Synchronized
        System.out.println(map);
        map.put(102,"Oracle");
        System.out.println(map);
        map.put(104,"JPA");
        System.out.println(map);
        System.out.println("Retrieving the data  by using key from HashMap : " + map.get("Java")); // 500
        System.out.println(map.get(103)); // SpringFramework
        System.out.println("Retrieving the keys from HashMap");
        HashSet<Object> hs1 = new HashSet<>(map.keySet());
        Iterator<Object> i1 = hs1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("Retrieving the key-value pairs from Hashmap");
        HashSet<Object> hs2 = new HashSet<>(map.entrySet());
        Iterator<Object> i2 = hs2.iterator();
        while(i2.hasNext()){
            //System.out.println(i2.next());
            Map.Entry e = (Map.Entry)i2.next();
            System.out.println(e.getKey() + "  " + e.getValue());
        }
    }
    public static void main(String[] args) {
        new HashMapClass().meth1();
    }
}
/*
In all MAP Implementation classes we can provide duplicate KEY-VALUE pairs,
if duplicate key is available then we will not be getting any error or exception.
OLD Value which is associated with the KEY will be replaced with the new value.
 */