package poo.refactor.extractmethod.bad;

public class Main {

    void printHtml(){
        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("Script");
        System.out.println("Copyright");
        System.out.println(" ");
    }

    private void printHead(){

    }
    private void printBody(){

    }
}
