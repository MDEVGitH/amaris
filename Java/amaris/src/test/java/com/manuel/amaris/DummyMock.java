package com.manuel.amaris;

import com.manuel.amaris.models.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DummyMock {

    public static Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("manuel");
        employee.setSurname("sanchez");
        employee.setSalary(new BigDecimal(5500000));
        employee.setEmail("manuelsanchez4780@gmail.com");
        employee.setAnualSalary(new BigDecimal(70000000));
        return employee;
    }

    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("manuel");
        employee.setSurname("sanchez");
        employee.setSalary(new BigDecimal(5500000));
        employee.setEmail("manuelsanchez4780@gmail.com");
        employee.setAnualSalary(new BigDecimal(70000000));

        Employee employee1 = new Employee();
        employee1.setId(2L);
        employee1.setName("manuel");
        employee1.setSurname("sanchez");
        employee1.setSalary(new BigDecimal(5500000));
        employee1.setEmail("manuelsanchez4780@gmail.com");
        employee1.setAnualSalary(new BigDecimal(70000000));

        employeeList.add(employee);
        employeeList.add(employee1);
        return employeeList;
    }

}
