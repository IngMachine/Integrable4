package poo.typesdata.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // CapacityVector = CapacityVector * 2

        // CapacityArrayList = CapacityArrayList + (CapacityArrayList * 0.5)
        ArrayList<String> list = new ArrayList<String>();
        list.add("Element A");
        list.add("Element B");
        list.add("Element C");

        list.remove("Element A");

        System.out.println("Content: " + list);

        for (String element : list){
            System.out.println(element);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        for(String element : array){
            System.out.println("Element is " + element);
        }

        for (Object arrayObject : list.toArray()){
            System.out.println(arrayObject.toString());
        }

    }
}
