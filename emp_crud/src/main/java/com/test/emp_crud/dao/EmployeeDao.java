package com.test.emp_crud.dao;

import com.test.emp_crud.model.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    public List<Emp> getAllEmp(){
        return List.of(new Emp(1, "pranaw",1000));
    }

}
