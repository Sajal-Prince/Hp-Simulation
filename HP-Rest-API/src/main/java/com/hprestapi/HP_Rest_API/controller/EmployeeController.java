package com.hprestapi.HP_Rest_API.controller;


import com.hprestapi.HP_Rest_API.entities.Employee;
import com.hprestapi.HP_Rest_API.service.EmployeeManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeManager employeeManager;

    @GetMapping("/")
    public List<Employee> allEmployeeList(){
        return employeeManager.getEmployees();
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        return employeeManager.addEmployee(employee);
    }
}
