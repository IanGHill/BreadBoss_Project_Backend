package com.codeclan.example.breadboss.repositories;

import com.codeclan.example.breadboss.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<Supplier> findByName(String name);

    List<Supplier> findAllByOrderByName();

}
