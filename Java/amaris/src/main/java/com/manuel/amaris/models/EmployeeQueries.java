package com.manuel.amaris.models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeQueries implements IEmployeeQueries{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Employee getEmployeeById(Long id) {
        String query = "FROM Employee WHERE id = :id";
        try{
            List<Employee> list = entityManager.createQuery(query)
                    .setParameter("id",id)
                    .getResultList();
            return list.size() == 0 ? null : list.get(0);
        }catch (Exception e){
            Employee employee = new Employee();
            return employee;
        }
    }

    @Transactional
    @Override
    public List<Employee> getEmployees() {
        String query = "FROM Employee";
        try{
            return entityManager.createQuery(query).getResultList();
        }catch (Exception e){
            List<Employee> emptyList = new ArrayList<>();
            emptyList.add(new Employee());
            return emptyList;
        }
    }
}
