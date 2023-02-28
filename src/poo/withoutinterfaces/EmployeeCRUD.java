package poo.withoutinterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve / Read
 * Update
 * Delete
 */
public class EmployeeCRUD {

    // structure of data
    private List<Employee> employees = new ArrayList<>();

    // Operations CRUD

    // Create - Save the employee
    public void save(Employee employee) {
        employees.add(employee);
    }

    //
    public List<Employee> findAll() {
        return this.employees;
    }
}
