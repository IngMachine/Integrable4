package poo.refactor.extractmethod.good;

public class Main {

    void printHtml(){
        printHead();
        printBody();
        printFooter();
    }

    private void printFooter() {
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
