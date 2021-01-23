package com.codeclan.example.breadboss.controllers;

import com.codeclan.example.breadboss.models.RawMaterial;
import com.codeclan.example.breadboss.models.Supplier;
import com.codeclan.example.breadboss.repositories.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class RawMaterialController {

  @Autowired
  RawMaterialRepository rawMaterialRepository;

  @GetMapping(value = "/raw_materials")
  public ResponseEntity<List<RawMaterial>> getAllRawMaterials(

    @RequestParam(name = "type", required = false) String type,
    @RequestParam(name = "name", required = false) String name,
    @RequestParam(name = "supplier", required = false) Supplier supplier,
    @RequestParam(name = "recipe-name", required = false) String recipeName,
    @RequestParam(name = "type-in", required = false) Collection<String> types
  )
  {

    if(type != null){
      return  new ResponseEntity<>(rawMaterialRepository.findByType(type), HttpStatus.OK);
    }
    if(name != null){
      return  new ResponseEntity<>(rawMaterialRepository.findByName(name), HttpStatus.OK);
    }
    if(supplier != null){
      return  new ResponseEntity<>(rawMaterialRepository.findBySupplier(supplier), HttpStatus.OK);
    }
    if(recipeName != null){
      return  new ResponseEntity<>(rawMaterialRepository.findAllByIngredientsRecipeName(recipeName), HttpStatus.OK);
    }
    if(types != null){
      return  new ResponseEntity<>(rawMaterialRepository.findByTypeIn(types), HttpStatus.OK);
    }

    List<RawMaterial> foundRawMaterials = rawMaterialRepository.findAll();
    return new ResponseEntity<>(foundRawMaterials, HttpStatus.OK);
  }

  @GetMapping(value = "/raw_materials/{id}")
  public ResponseEntity getRawMaterial(@PathVariable Long id){
    return new ResponseEntity (rawMaterialRepository.findById(id), HttpStatus.OK);
  }

  @PostMapping(value = "/raw_materials")
  public ResponseEntity<RawMaterial> postRawMaterial(@RequestBody RawMaterial rawMaterial){
    rawMaterialRepository.save(rawMaterial);
    return new ResponseEntity<>(rawMaterial, HttpStatus.CREATED);
  }

  @PutMapping(value = "/raw_materials/{id}")
  public ResponseEntity<RawMaterial> putRawMaterial(@RequestBody RawMaterial rawMaterial, @PathVariable Long id){
    rawMaterialRepository.save(rawMaterial);
    return new ResponseEntity<>(rawMaterial, HttpStatus.CREATED);
  }

  @DeleteMapping(value = "/raw_materials/{id}")
  public ResponseEntity<List<RawMaterial>> deleteRawMaterial(@PathVariable Long id){
    rawMaterialRepository.deleteById(id);
    return new ResponseEntity<>(rawMaterialRepository.findAll(), HttpStatus.OK);
  }
}
