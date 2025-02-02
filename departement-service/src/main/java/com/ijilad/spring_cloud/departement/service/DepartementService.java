package com.ijilad.spring_cloud.departement.service;

import com.ijilad.spring_cloud.departement.dto.DepartementDto;
import com.ijilad.spring_cloud.departement.exception.EntityNotFound;
import com.ijilad.spring_cloud.departement.model.Departement;
import com.ijilad.spring_cloud.departement.repository.DepartementRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartementService {

    private DepartementRepository repository;

    public DepartementService(DepartementRepository repository) {
        this.repository = repository;
    }

    public Departement getDepartement(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFound("No dept with given id."));
    }

    public Long add(DepartementDto dto) {
        Departement departement = new Departement();
        departement.setDescription(dto.getDescription());
        departement.setName(dto.getName());
        Departement saved = repository.save(departement);
        return saved.getId();
    }
}
