package org.example.test.assessment.microservices.exercises.two.entity.interfaces;

import org.example.test.assessment.microservices.exercises.two.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeById(long id);

    void addEmployee(Employee employee);
}
