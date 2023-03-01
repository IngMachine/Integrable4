package poo.manageerrors;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            divide(4,0);
        } catch (Exception e) {
            System.out.println("AAA");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter twos numbers: ");

        try {
            int numberA = scanner.nextInt();
            int numberB = scanner.nextInt();
            int result = numberA / numberB;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e){
            System.out.println("Boom!, exception is: " + e.getClass());
        } catch (Exception e){
            System.out.println("I am in an exception who not is arithmetic");
        } finally {
            System.out.println("finally done");
        }



        System.out.println("Enter the temperature: ");
        int temperature = scanner.nextInt();
        if(temperature < 15){
            System.out.println("It's Cool");
        }
    }

    public static int divide(int A, int B) throws ArithmeticException, IOException{
        int result = 0;
        try {
            result = A / B;
        } catch (ArithmeticException e){
            throw new IOException();
        }
        return result;
    }
}
