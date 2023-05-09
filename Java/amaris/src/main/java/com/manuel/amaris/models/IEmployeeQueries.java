package com.manuel.amaris.models;

import java.util.List;

public interface IEmployeeQueries {

    Employee getEmployeeById(Long id);
    List<Employee> getEmployees();


}
