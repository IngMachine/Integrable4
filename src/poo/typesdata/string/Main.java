package poo.typesdata.string;

public class Main {
    public static void main(String[] args) {
        String chain = "Message of text";
        int chainLength = chain.length();
        System.out.println("The length of the chain is " + chainLength);

        String chainToLowerCase = chain.toLowerCase();
        System.out.println("The chain now is " + chainToLowerCase);

        String chainToUpperCase = chain.toUpperCase();
        System.out.println("The chain now is " + chainToUpperCase);

        boolean result = chain.startsWith("Message");
        if(result){
            System.out.println("Start with what I want");
        } else {
            System.out.println("Does not start with what I want");
        }

        boolean resultEnd = chain.endsWith("o");
        if(resultEnd){
            System.out.println("End with what I want");
        } else {
            System.out.println("Does not end with what I want");
        }

        char letra = chain.charAt(14);
        System.out.println("The character at index 15 is " + letra);

        for (int i = 0; i < chainLength; i++){
            System.out.println("Character actual is : " + chain.charAt(i));
        }

        StringBuilder chainInvert = new StringBuilder();
        for (int i = chainLength - 1; i >= 0; i--){
            chainInvert.append(chain.charAt(i));
        }
        System.out.println("The chain now is " + chainInvert);
    }
}
