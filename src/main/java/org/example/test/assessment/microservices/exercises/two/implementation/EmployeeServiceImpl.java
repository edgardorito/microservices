package org.example.test.assessment.microservices.exercises.two.implementation;

import org.example.test.assessment.microservices.exercises.two.entity.Employee;
import org.example.test.assessment.microservices.exercises.two.entity.interfaces.EmployeeService;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getAllEmployees() {
        return Employee.buildEmployees();
    }

    @Override
    public Employee getEmployeById(long id) {
        return Employee.buildEmployees().get(Math.toIntExact(id));
    }

    @Override
    public void addEmployee(Employee employee) {
        Employee.buildEmployees().add(employee);
    }
}
