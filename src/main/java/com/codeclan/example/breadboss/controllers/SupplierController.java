package com.codeclan.example.breadboss.controllers;

import com.codeclan.example.breadboss.models.Recipe;
import com.codeclan.example.breadboss.models.Supplier;
import com.codeclan.example.breadboss.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping(value = "/suppliers")
    public ResponseEntity<List<Supplier>> getAllSuppliers(

            @RequestParam(name = "name", required = false) String supplierName
    )
    {

        if(supplierName != null){
            return  new ResponseEntity<>(supplierRepository.findByName(supplierName), HttpStatus.OK);
        }

        List<Supplier> foundSuppliers = supplierRepository.findAllByOrderByName();
        return new ResponseEntity<>(foundSuppliers, HttpStatus.OK);
    }
}
