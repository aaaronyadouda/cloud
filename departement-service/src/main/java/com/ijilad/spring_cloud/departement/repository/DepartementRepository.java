package com.ijilad.spring_cloud.departement.repository;

import com.ijilad.spring_cloud.departement.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
}
