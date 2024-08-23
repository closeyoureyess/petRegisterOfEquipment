package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;


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
}
