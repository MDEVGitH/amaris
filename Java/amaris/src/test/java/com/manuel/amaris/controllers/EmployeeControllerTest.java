package com.manuel.amaris.controllers;

import com.manuel.amaris.DummyMock;
import com.manuel.amaris.models.Employee;
import com.manuel.amaris.models.EmployeeQueries;
import com.manuel.amaris.models.EmployeeQueriesTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

public class EmployeeControllerTest {

    @InjectMocks
    private EmployeeController employeeController;

    @Mock
    private EmployeeQueries employeeQueries;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSearch(){
        Mockito.when(employeeQueries.getEmployeeById(1L)).thenReturn(DummyMock.getEmployee());
        Employee employee = employeeController.search(1L);
        Assert.assertEquals(Optional.of(1L), Optional.of(employee.getId()));
    }

    @Test
    public void testSearchList(){
        Mockito.when(employeeQueries.getEmployees()).thenReturn(DummyMock.getEmployees());
        List<Employee> employeeList = employeeController.search();
        Assert.assertEquals(2, employeeList.size());
    }

}
