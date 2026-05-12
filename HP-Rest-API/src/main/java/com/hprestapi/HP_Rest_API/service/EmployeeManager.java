package com.hprestapi.HP_Rest_API.service;

import com.hprestapi.HP_Rest_API.entities.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {
    List<Employee> employees = new ArrayList<>();

    public EmployeeManager(){
        employees.add(new Employee("1","Sajal","Shrivastava","sajal.mainhuna@gmail.com","Owner"));
        employees.add(new Employee("2","Surya Pratap","Singh Tomar","suryatomar@gmail.com","Friend"));
        employees.add(new Employee("3","P","Surya","p.surya@gmail.com","Friend 2"));
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public ResponseEntity<?> addEmployee(Employee employee){
        employees.add(employee);
        return ResponseEntity.ok("Employee was added with id : " + employee.getEmployee_id());
    }




}
