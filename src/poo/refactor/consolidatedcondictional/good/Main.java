package poo.refactor.consolidatedcondictional.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;
    double calculateExtraSalary(){
        double result = 0.0;
        if(!isCandidateExtraSalary()){
            return 0.0;
        }
        // Calculate the extra salary:
        // ...
        return result;
    }

    public boolean isCandidateExtraSalary(){
        // group conditions using and (&&) y or (||)
        boolean studies = seniority < 1 || education < 1;
        boolean antiquity = incidents > 10 && !certification;
        return studies || antiquity;
    }
}
