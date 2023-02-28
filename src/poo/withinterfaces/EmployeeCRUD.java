package poo.withinterfaces;

import poo.withoutinterfaces.Employee;

import java.util.List;

/**
 * The methods are declared, but not implemented.
 * acts as a contract, of what to do but does not do it.
 */
public interface EmployeeCRUD {
    void save(Employee employee);
    List<Employee> findAll();

    void delete(Employee employee);
}
