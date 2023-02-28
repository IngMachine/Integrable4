package poo.refactor.consolidateduplicate.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;
    double calculateExtraSalary(){
        double result = 0.0;
        if(isCandidateExtraSalary()){
            result = 500.0;
        } else {
            result =  0.0;
        }
        sendMessage();

        // Calculate the extra salary:
        // ...
        return result;
    }

    private void sendMessage() {
        // send email
        // connect smtp
        System.out.println("Sending email");
    }

    public boolean isCandidateExtraSalary(){
        // group conditions using and (&&) y or (||)
        boolean studies = seniority < 1 || education < 1;
        boolean antiquity = incidents > 10 && !certification;
        return studies || antiquity;
    }
}
