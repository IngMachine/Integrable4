package poo.typesdata.vectors;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vectorNumbers = new Vector<>(1,15);
        vectorNumbers.add(1);
        vectorNumbers.add(2);
        vectorNumbers.add(3);
        vectorNumbers.add(4);
        vectorNumbers.add(5);
        vectorNumbers.add(6);
        vectorNumbers.add(7);
        vectorNumbers.add(8);
        vectorNumbers.add(9);
        vectorNumbers.add(10);
        vectorNumbers.add(11);

        System.out.println(vectorNumbers.get(10));
        vectorNumbers.remove(10);
        System.out.println(vectorNumbers.get(9));
        System.out.println("data of vector numbers " + vectorNumbers);

        vectorNumbers.remove(2);
        System.out.println("data of vector numbers " + vectorNumbers);

        System.out.println("vector length " + vectorNumbers.size() +" and capacity " + vectorNumbers.capacity());

        Vector<Integer> vectorNumbers2 = new Vector<>();
        vectorNumbers2.add(1);
        vectorNumbers2.add(2);

        boolean result = vectorNumbers.equals(vectorNumbers2);

        System.out.println("are equals: " + result);

        for (int i : vectorNumbers) {
            System.out.println("value actually in vector " + i);
        }

        for (int i = 0; i < vectorNumbers.size() -  1; i++){
            if( i % 2 == 0 ){
                vectorNumbers.remove(i);
                continue;
            }
            System.out.println("Value is " + vectorNumbers.get(i) + " in position " + i);
        }

        System.out.println("--------------------------------");
        Vector<Integer> vectorNumbers3 = new Vector<>(16);
        vectorNumbers3.add(1);
        vectorNumbers3.add(2);
        vectorNumbers3.add(3);

        System.out.println("Capacity: " + vectorNumbers3.capacity() + " size: " + vectorNumbers3.size());
        vectorNumbers3.trimToSize();
        System.out.println("Capacity: " + vectorNumbers3.capacity() + " size: " + vectorNumbers3.size());
    }
}
