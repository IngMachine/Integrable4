package poo.withoutinterfaces;

public class Employee {
    // 1- attribute
    String name;
    int age;
    double salary;
    boolean high;
    // 2- constructor
    public Employee(){

    }

    public Employee(String name, int age, double salary, boolean high){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.high = high;
    }
    // 3- methods

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", high=" + high +
                '}';
    }
}
