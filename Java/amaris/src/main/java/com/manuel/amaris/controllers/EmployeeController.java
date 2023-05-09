package com.manuel.amaris.controllers;

import com.manuel.amaris.models.AnualSalaryEmployee;
import com.manuel.amaris.models.Employee;
import com.manuel.amaris.models.IEmployeeQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController implements IEmployeeController{

    @Autowired
    private IEmployeeQueries employeeQueries;

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(value ="api/v1/employees/{id}" , method = RequestMethod.GET)
    public Employee search(@PathVariable("id") Long id) {
        Employee employee = employeeQueries.getEmployeeById(id);
        if(employee!=null){
            employee.setAnualSalary(AnualSalaryEmployee.getAnualSalary(employee.getSalary()));
        }
        return employee;
    }

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(value ="api/v1/employees" , method = RequestMethod.GET)
    public List<Employee> search() {
        List<Employee> employees = employeeQueries.getEmployees();
        employees.forEach(employee -> {
            if(employee != null){
                employee.setAnualSalary(AnualSalaryEmployee.getAnualSalary(employee.getSalary()));
            }
        });
        return employees;
    }

}
