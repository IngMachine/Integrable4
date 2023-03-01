package poo.inputsandoutputs;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
                System.out.println("Integers are : " + a + " " + b);
            } catch (InputMismatchException e) {
                System.out.println("Numbers invalid");
            }
        } while (!ok);
        // print steam
        System.out.println("something");
        try {
            PrintStream info = new PrintStream("copy.txt");
            info.println("hola");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try{
            InputStream file = new FileInputStream("C:/files/somefile.txt");
            try {
                byte[] bytes = new byte[file.available()];
                file.read(bytes);
                System.out.println(new String(bytes));
            } catch (IOException e) {
                System.out.println("No can read the file: " + e.getMessage());
            }
        } catch (Exception e){
            System.out.println("Error reading " + e.getMessage());
        }

        try{
            InputStream file1 = new FileInputStream("C:/files/somefile.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(file1);
            try {
                int data = fileBuffer.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = fileBuffer.read();
                }
            } catch (IOException e) {
                System.out.println("No can read the file: " + e.getMessage());
            }
        } catch (Exception e){
            System.out.println("Error reading " + e.getMessage());
        }

        try {
            InputStream in  = new FileInputStream("C:/files/somefile.txt");
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out =  new PrintStream("destiny.txt");
            out.write(data);
            out.close();

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
