package com.codeclan.example.breadboss.controllers;

import com.codeclan.example.breadboss.repositories.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RawMaterialController {

  @Autowired
  RawMaterialRepository rawMaterialRepository;
}
