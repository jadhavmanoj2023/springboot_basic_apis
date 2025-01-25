package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Fetch all employees
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }

    //Fetch employee by id
    public Optional<Employee> getEmployeeById(String id){
        return employeeRepository.findById(id);
    }

    //Add employee
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    //update employee
    public Employee updateEmployee(String id,Employee employee){
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    //delete Employee
    public void deleteEmployee(String id){
        employeeRepository.deleteById(id);
    }

}
