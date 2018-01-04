package com.lewandowski.owczarekpathvariable;

import java.util.List;

public class Company {
    private String name;
    private List<com.owczarek.Employee> employees;

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
