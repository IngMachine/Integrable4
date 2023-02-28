package poo.withoutinterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        Employee fredy = new Employee("Fredy", 25, 40000.0, true);
        Employee patricia = new Employee("Patricia", 25, 40000.0, true);
        Employee marina = new Employee("Marina", 25, 40000.0, true);

        // save employees
        employeeCRUD.save(fredy);
        employeeCRUD.save(patricia);
        employeeCRUD.save(marina);

        // consult employees
        List<Employee> employees = employeeCRUD.findAll();
        System.out.println(employees);
        */

        // problem of not using the interface
        EmployeeCRUDMySQL employeeCRUD = new EmployeeCRUDMySQL();

        Employee fredy = new Employee("Fredy", 25, 40000.0, true);
        Employee patricia = new Employee("Patricia", 25, 40000.0, true);
        Employee marina = new Employee("Marina", 25, 40000.0, true);

        // consult employees
        List<Employee> employees = employeeCRUD.recoveringEmployees();
        System.out.println(employees);
    }
}
