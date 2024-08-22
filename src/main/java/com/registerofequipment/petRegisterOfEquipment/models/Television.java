package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "television_tech")
public class Television {

    @Column(name = "category_tv")
    private String category;
    @Column(name = "technology_tv")
    private String technology;

    public Television(String category, String technology) {
        this.category = category;
        this.technology = technology;
    }

    public Television(String category) {
        this.category = category;
    }

    public Television(String technology, String... category) {
        this.technology = technology;
    }

    public Television(){

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
        return Objects.equals(category, that.category) && Objects.equals(technology, that.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, technology);
    }
}
