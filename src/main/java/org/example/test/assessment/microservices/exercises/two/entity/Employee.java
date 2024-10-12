package org.example.test.assessment.microservices.exercises.two.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static List<Employee> buildEmployees() {
        Employee employee = new Employee(1, "Ed", "RD", 24 );
        Employee employee2 = new Employee(2, "Tom", "GT", 35 );

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(employee);
        employees.add(employee2);

        return employees;
    }
}
