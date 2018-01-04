package com.lewandowski.owczarekmvcfirstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("employees")
@RestController
public class EmployeesController {
    @RequestMapping(value = "/getEmployees", method = {RequestMethod.POST, RequestMethod.GET})
  //  @PostMapping ("/getEmployees")
    public List<Employee> getEmployees(){
        List<Employee> result = new ArrayList<>();

        result.add(new Employee("Jan", "Nowak", new BigDecimal("3433.55")));
        result.add(new Employee("Krzysztof", "Kowalski", new BigDecimal("5433.55")));
        result.add(new Employee("Wojtek", "Herman", new BigDecimal("4433.55")));

        return result;
    }

    @RequestMapping(value = "findAny", method = RequestMethod.GET )
    @GetMapping("findAny")
    public Employee findAny(){
        return new Employee("Jan", "Nowak", new BigDecimal("3433.55"));
    }
}
