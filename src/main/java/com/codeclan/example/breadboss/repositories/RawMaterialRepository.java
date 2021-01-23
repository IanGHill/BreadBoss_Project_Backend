package com.codeclan.example.breadboss.repositories;

import com.codeclan.example.breadboss.models.RawMaterial;
import com.codeclan.example.breadboss.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {

  List<RawMaterial> findAll();

  List<RawMaterial> findByName(String name);

  List<RawMaterial> findByType(String type);

  List<RawMaterial>findByTypeIn(Collection<String> types);

  List<RawMaterial> findBySupplier(Supplier supplier);

  List<RawMaterial> findAllByIngredientsRecipeName(String name);
}
