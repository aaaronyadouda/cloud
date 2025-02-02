package com.ijilad.spring_cloud.departement.client;

import com.ijilad.spring_cloud.departement.dto.EmployeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "employee-service")
public interface EmployeeClient {

    @GetMapping("/departement")
    List<EmployeeDto> getAll();
}
