package poo.exercise.sessionseveneightnine;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello, world!";
        StringBuilder helloWorldInvert = new StringBuilder();
        for (int i = helloWorld.length() - 1; i >= 0; i--){
            helloWorldInvert.append(helloWorld.charAt(i));
        }
        System.out.println("The chain now is " + helloWorldInvert);

        String[] names = {
                "Fredy",
                "Cristian",
                "Holman",
                "Ricardo"
        };

        for (String name : names){
            System.out.println(name);
        }

        Vector<String> vector = new Vector<String>();
        vector.add("Fredy");
        vector.add("Cristian");
        vector.add("Holman");
        vector.add("Ricardo");
        vector.add("Jose");

        vector.remove(1);
        vector.remove(2);

        for (String name : vector){
            System.out.println(name);
        }

        /**
         * El problema de utilizar es que es carisimo a nivel computacional ya que se debe copiar todos los
         * valores en un nuevo array y agregar la mitad de la capacidad actual, osea 1500 de capacidad en total
         * lo que relentiza la aplicacion y mayor almacenamiento
         */

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Fredy");
        arrayList.add("Cristian");
        arrayList.add("Holman");
        arrayList.add("Ricardo");

        LinkedList<String> linkedList = new LinkedList<String>(arrayList);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("linked-list: " + linkedList.get(i));
            System.out.println("array-list: " +arrayList.get(i));
        }

        ArrayList<Integer> arraylistNumbers = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            arraylistNumbers.add(i);
        }
        for(int i = 0; i < arraylistNumbers.size(); i++){
            System.out.println(arraylistNumbers.get(i) % 2  == 0);
        }

        for(int i = 0; i < arraylistNumbers.size() - 1; i++){
            if(arraylistNumbers.get(i) % 2  == 0){
                arraylistNumbers.remove(i);
            }
        }

        System.out.println(arraylistNumbers);

        try{
            divideForZero(4);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try{
            copyFile("copy.txt", "output.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divideForZero(int a) throws ArithmeticException{
        int result = 0;
        try {
            result = a / 0;
        } catch (ArithmeticException e){
            throw new ArithmeticException("Esto no puede hacerse.");
        }
        return result;
    }

    public static void copyFile(String fileIn, String fileOut) throws IOException {
        // Create streams of entrance y output
        InputStream inputStream = new FileInputStream(fileIn);
        PrintStream printStream = new PrintStream(new FileOutputStream(fileOut));

        byte[] buffer = new byte[1024];
        int length;

        while ((length = inputStream.read(buffer)) > 0) {
            printStream.write(buffer, 0, length);
        }

        inputStream.close();
        printStream.close();
    }

}
