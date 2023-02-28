package poo.withinterfaces;

import poo.withoutinterfaces.Employee;

public class Main {
    static EmployeeCRUD employeeCRUD = new EmployeeCRUDMySQL();
    public static void main(String[] args) {
        employeeCRUD.findAll();
        employeeCRUD.save(new Employee());
    }
}
