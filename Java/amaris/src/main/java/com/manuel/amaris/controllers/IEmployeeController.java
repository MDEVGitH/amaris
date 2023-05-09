package com.manuel.amaris.controllers;

import com.manuel.amaris.models.Employee;

import java.util.List;

public interface IEmployeeController {

    Employee search(Long id);

    List<Employee> search();

}
