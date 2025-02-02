package com.ijilad.spring_cloud.employee.service;

import com.ijilad.spring_cloud.employee.dto.EmployeeDto;
import com.ijilad.spring_cloud.employee.exception.EntityNotFound;
import com.ijilad.spring_cloud.employee.model.Employee;
import com.ijilad.spring_cloud.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getEmployee(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFound("No employee with given id."));
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Long add(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setDescription(dto.getDescription());
        employee.setName(dto.getName());
        Employee saved = repository.save(employee);
        return saved.getId();
    }
}
