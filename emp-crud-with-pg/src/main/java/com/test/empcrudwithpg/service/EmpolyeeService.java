package com.test.empcrudwithpg.service;

import com.test.empcrudwithpg.model.Employee;
import com.test.empcrudwithpg.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpolyeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(Integer id, Employee employee) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            Employee emp = optional.get();
            emp.setName(employee.getName());
            emp.setSalary(employee.getSalary());
            emp.setDateOfBirth(employee.getDateOfBirth());
            return employeeRepository.save(emp);
        }
        return null;
    }

    public Boolean deleteById(int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
