package com.codeclan.example.breadboss.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private String type;

  @Column
  private String imageUrl;

  @Column
    (name = "created", nullable = false, updatable=false)
  private Date created;

  @Column
    (name = "updated", nullable = false)
  private Date updated;

  @PrePersist
  protected void onCreate() {
    created = new Date();
  }

  @PreUpdate
  protected void onUpdate() {
    updated = new Date();
  }

  @JsonBackReference
  @OneToMany(mappedBy = "recipe")
  private List<Ingredient> ingredients;

  public Recipe(String name, String type) {
    this.name = name;
    this.type = type;
    this.imageUrl = new String();
    this.ingredients = new ArrayList<Ingredient>();
    this.onCreate();
    this.onUpdate();
  }

  public Recipe() {
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

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  public void addIngredient(Ingredient ingredient){
    this.ingredients.add(ingredient);
  }
}
