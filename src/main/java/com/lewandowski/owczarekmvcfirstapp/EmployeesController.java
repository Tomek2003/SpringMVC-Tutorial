package com.lewandowski.owczarekmvcfirstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("employees")
@RestController
public class EmployeesController {
    @RequestMapping(value = "/getEmployees", method = RequestMethod.POST)
    public List<Employee> getEmployees(){
        List<Employee> result = new ArrayList<>();

        result.add(new Employee("Jan", "Nowak", new BigDecimal("3433.55")));
        result.add(new Employee("Krzysztof", "Kowalski", new BigDecimal("5433.55")));
        result.add(new Employee("Wojtek", "Herman", new BigDecimal("4433.55")));

        return result;
    }

    @RequestMapping(value = "findAny", method = RequestMethod.GET )
    public Employee findAny(){
        return new Employee("Jan", "Nowak", new BigDecimal("3433.55"));
    }
}
