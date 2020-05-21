package com.codeclan.example.breadboss.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rawmaterials")
public class RawMaterial {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private String type;

  @Column
  private String supplier;

  @Column
  private int packSize;

  @Column
  private float price;

  @JsonBackReference
  @OneToMany(mappedBy = "rawMaterial")
  private List<Ingredient> ingredients;

  public RawMaterial(String name, String type, String supplier, int packSize, float price) {
    this.name = name;
    this.type = type;
    this.supplier = supplier;
    this.packSize = packSize;
    this.price = price;
    this.ingredients = new ArrayList<Ingredient>();
  }

  public RawMaterial() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public int getPackSize() {
    return packSize;
  }

  public void setPackSize(int packSize) {
    this.packSize = packSize;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }
}
