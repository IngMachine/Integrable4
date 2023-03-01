package poo.typesdata.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key 1", 1);
        map.put("key 2", 2);
        map.put("key 3", 3);
        map.put("key 3", 4);
        map.replace("key 4", 5);

        map.remove("key 3");
        System.out.println(map);
        map.replace("key 3", 5);

        for (Map.Entry element : map.entrySet()) {
            System.out.println("Element key is " + element.getKey());
            System.out.println("Element value is " + element.getValue());
        }


        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("key_1", 1);
        map1.put("key_2", 2);
        map1.put("key_3", 3);
        map1.put("key_3", 4);
        map1.replace("key_4", 5);

        map1.remove("key_3");
        System.out.println(map1);
        map1.replace("key_3", 5);

        for (Map.Entry<String, Integer> element : map1.entrySet()) {
            System.out.println("Element key is " + element.getKey());
            System.out.println("Element value is " + element.getValue());
        }
    }
}
