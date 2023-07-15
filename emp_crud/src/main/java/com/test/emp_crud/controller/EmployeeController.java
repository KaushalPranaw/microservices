package com.test.emp_crud.controller;

import com.test.emp_crud.model.Emp;
import com.test.emp_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Emp> getAllEmp() {
        return employeeService.getAllEmps();
    }

    @GetMapping("/{id}")
    public Emp getEmpById(@PathVariable int id) {
        return employeeService.getEmpById(id);
    }

    @PostMapping
    public Emp saveEmp(@RequestBody Emp employee) {
        return employeeService.saveEmp(employee);
    }

    @PutMapping("/{id}")
    public String updateEmp(@PathVariable int id, @RequestBody Emp employee) {
        return employeeService.updateEmp(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable int id) {
        return employeeService.deleteEmp(id);
    }


}
