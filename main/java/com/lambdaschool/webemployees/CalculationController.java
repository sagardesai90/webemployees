package com.lambdaschool.webemployees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/calc")
@RestController
public class CalculationController
{
    @RequestMapping("/salary")
    public Employee checkRaise(@RequestParam(value = "id") long id,
                               @RequestParam(value = "raise") double raise)
    {
        Employee tempEmp = WebemployeesApplication.ourEmpList.findEmployee(e -> (e.getId() == id));
        tempEmp.setSalary(tempEmp.getSalary() * (1.0 + raise));
        return tempEmp;
    }
}
