package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;
import java.util.Objects;

public class TelevisionDto implements Serializable {

    private String category;
    private String technology;

    public TelevisionDto(String category, String technology) {
        this.category = category;
        this.technology = technology;
    }

    public TelevisionDto(String category) {
        this.category = category;
    }

    public TelevisionDto(String technology, String... category) {
        this.technology = technology;
    }

    public TelevisionDto(){

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
        TelevisionDto that = (TelevisionDto) o;
        return Objects.equals(category, that.category) && Objects.equals(technology, that.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, technology);
    }
}
