package com.test.empcrudwithpg.controller;

import com.test.empcrudwithpg.model.Employee;
import com.test.empcrudwithpg.service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmpolyeeService empolyeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> emps = empolyeeService.findAll();
        return new ResponseEntity<>(emps, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable int id) {
        Optional<Employee> employee = empolyeeService.findById(id);
        return employee.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        Employee emp = empolyeeService.save(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable int id, @RequestBody Employee employee) {
        Employee updatedEmp = empolyeeService.update(id, employee);
        if (updatedEmp != null) {
            return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        Boolean deleted = empolyeeService.deleteById(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
