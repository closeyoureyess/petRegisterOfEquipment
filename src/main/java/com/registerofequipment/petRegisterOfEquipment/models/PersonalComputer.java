package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "personal_computer_tech")
public class PersonalComputer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "processor_type")
    private String typeProcessor;
    @Column(name = "category")
    private String category;
    @Transient
    private Integer serviceFlag;

    public PersonalComputer(Integer id, String typeProcessor, String category, Integer serviceFlag) {
        this.id = id;
        this.typeProcessor = typeProcessor;
        this.category = category;
        this.serviceFlag = serviceFlag;
    }

    public PersonalComputer(Integer id, String typeProcessor, String category) {
        this.id = id;
        this.typeProcessor = typeProcessor;
        this.category = category;
    }

    public PersonalComputer(Integer id, String typeProcessor) {
        this.id = id;
        this.typeProcessor = typeProcessor;
    }

    public PersonalComputer(String typeProcessor, String category) {
        this.typeProcessor = typeProcessor;
        this.category = category;
    }

    public PersonalComputer(Integer id) {
        this.id = id;
    }

    public PersonalComputer(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeProcessor() {
        return typeProcessor;
    }

    public void setTypeProcessor(String typeProcessor) {
        this.typeProcessor = typeProcessor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getServiceFlag() {
        return serviceFlag;
    }

    public void setServiceFlag(Integer serviceFlag) {
        this.serviceFlag = serviceFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalComputer that = (PersonalComputer) o;
        return Objects.equals(id, that.id) && Objects.equals(typeProcessor, that.typeProcessor) && Objects.equals(category, that.category) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeProcessor, category, serviceFlag);
    }
}
