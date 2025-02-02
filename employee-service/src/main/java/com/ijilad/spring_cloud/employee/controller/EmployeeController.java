package com.ijilad.spring_cloud.employee.controller;

import com.ijilad.spring_cloud.employee.dto.EmployeeDto;
import com.ijilad.spring_cloud.employee.model.Employee;
import com.ijilad.spring_cloud.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        return service.getEmployee(id);
    }

    @GetMapping("/departement")
    public List<Employee> findAll() {
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity add(@RequestBody EmployeeDto dto) {
        return new ResponseEntity<>(service.add(dto), HttpStatus.CREATED);
    }
}
