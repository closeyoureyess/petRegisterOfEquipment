package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "television_tech")
public class Television {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "category_tv")
    private String category;
    @Column(name = "technology_tv")
    private String technology;
    @Transient
    private Integer serviceFlag;

    public Television(Integer id, String category, String technology, Integer serviceFlag) {
        this.id = id;
        this.category = category;
        this.technology = technology;
        this.serviceFlag = serviceFlag;
    }

    public Television(Integer id, String category, String technology) {
        this.id = id;
        this.category = category;
        this.technology = technology;
    }

    public Television(Integer id, String category) {
        this.id = id;
        this.category = category;
    }

    public Television(String category, String technology) {
        this.category = category;
        this.technology = technology;
    }

    public Television(Integer id) {
        this.id = id;
    }

    public Television(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return Objects.equals(id, that.id) && Objects.equals(category, that.category) && Objects.equals(technology, that.technology) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, technology, serviceFlag);
    }
}
