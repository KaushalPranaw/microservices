package com.test.emp_crud.service;

import com.test.emp_crud.dao.EmployeeDao;
import com.test.emp_crud.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Emp> getAllEmps(){
        return employeeDao.getAllEmp();
    }

    public Emp getEmpById(int id){
        return employeeDao.getAllEmp().stream().filter(e->e.getEmpId()==id).findFirst().get();
    }

    public Emp saveEmp( Emp employee){
        employeeDao.getAllEmp().add(employee);
        return employee;
    }

    public String updateEmp(int id, Emp employee){
        employeeDao.getAllEmp().addAll(employeeDao.getAllEmp().stream().map(e->{
            if(e.getEmpId()==id){
                e.setName(employee.getName());
                e.setSalary(employee.getSalary());
            }
            return e;
        }).collect(Collectors.toList()));
        return "Emp updated";
    }

    public String deleteEmp(int id){
        employeeDao.getAllEmp().remove(getEmpById(id));
        return "Emp deleted";
    }



}
