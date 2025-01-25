package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Employee {
    @Id
    private String id ;
    private String name;
    private String employeeId;
    private double salary;
    private String email;

    public Employee(){};

    public Employee(String name,String employeeId,double salary,String email){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.email = email;
    }

    //Getters and setters

    public String getId(){ return  id;}
    public void setId(String id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getEmployeeId(){return employeeId;}
    public void setEmployeeId(String employeeId){this.employeeId = employeeId;}

    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary = salary;}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
