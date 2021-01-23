package com.codeclan.example.breadboss.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String businessName;

    @Column
    private String contactFirstName;

    @Column
    private String contactLastName;

    @Column
    private String telephoneNumber;

    @Column
    private String emailAddress;

    @JsonBackReference
    @OneToMany(mappedBy = "supplier")
    private List<RawMaterial> rawMaterials;

    public Supplier(String businessName, String contactFirstName, String contactLastName, String telephoneNumber, String emailAddress) {
        this.businessName = businessName;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.rawMaterials = new ArrayList<RawMaterial>();
    }

    public Supplier() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }

    public void setRawMaterials(List<RawMaterial> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }
}
