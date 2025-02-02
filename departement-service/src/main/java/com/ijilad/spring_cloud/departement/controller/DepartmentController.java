package com.ijilad.spring_cloud.departement.controller;

import com.ijilad.spring_cloud.departement.client.EmployeeClient;
import com.ijilad.spring_cloud.departement.dto.DepartementDto;
import com.ijilad.spring_cloud.departement.dto.EmployeeDto;
import com.ijilad.spring_cloud.departement.model.Departement;
import com.ijilad.spring_cloud.departement.service.DepartementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DepartmentController {

    private final DepartementService service;

    private final EmployeeClient employeeClient;

    public DepartmentController(DepartementService service, EmployeeClient employeeClient) {
        this.service = service;
        this.employeeClient = employeeClient;
    }

    @GetMapping("/{id}")
    public Departement findById(@PathVariable("id") Long id) {
        return service.getDepartement(id);
    }

    @GetMapping("/employees")
    public List<EmployeeDto> getEmployees() {
        return employeeClient.getAll();
    }

    @PostMapping
    public ResponseEntity add(@RequestBody DepartementDto dto) {
        return new ResponseEntity<>(service.add(dto), HttpStatus.CREATED);
    }
}
