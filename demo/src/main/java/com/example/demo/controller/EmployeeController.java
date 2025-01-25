package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
@Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String  getAllEmployees(){
        return  "HEllo there ";
    }



//    @GetMapping
//    public List<Employee> getAllEmployees(){
//        return  employeeService.getAllEmployees();
//    }

    // GET

    //
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id){ // Extract id from url
        return employeeService.getEmployeeById(id);
    }

    //POST
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){ // extract request body  and maps into employee object
        return employeeService.addEmployee(employee);
    }

    //PUT
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id,@RequestBody Employee employee){
        return  employeeService.updateEmployee(id,employee);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
    }

}
