package com.codeclan.example.breadboss.repositories;

import com.codeclan.example.breadboss.models.RawMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {
}
