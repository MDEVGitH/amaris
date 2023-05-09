package com.manuel.amaris.models;

import com.manuel.amaris.DummyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class EmployeeQueriesTest {

    @InjectMocks
    private EmployeeQueries employeeQueries;

    @Mock
    private EntityManager entityManager;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getEmployeeByIdTest(){
        employeeQueries.getEmployeeById(1L);

        TypedQuery<Employee> query = (TypedQuery<Employee>) Mockito.mock(TypedQuery.class);
        Mockito.when(entityManager.createQuery("FROM Employee WHERE id = :id")).thenReturn(query);
        Mockito.when(entityManager.createQuery("FROM Employee WHERE id = :id").setParameter("id", 1L)).thenReturn(query);
        Mockito.when(entityManager.createQuery("FROM Employee WHERE id = :id").setParameter("id", 1L).getResultList()).thenReturn(DummyMock.getEmployees());
        Employee employee = employeeQueries.getEmployeeById(1L);
        Assert.assertEquals(Optional.of(1L), Optional.of(employee.getId()));
    }

    @Test
    public void getEmployeesTest(){
        employeeQueries.getEmployees();

        TypedQuery<Employee> query = (TypedQuery<Employee>) Mockito.mock(TypedQuery.class);
        Mockito.when(entityManager.createQuery("FROM Employee")).thenReturn(query);
        Mockito.when(entityManager.createQuery("FROM Employee").getResultList()).thenReturn(DummyMock.getEmployees());
        List<Employee> employee = employeeQueries.getEmployees();
        Assert.assertEquals(2, employee.size());
    }

}
