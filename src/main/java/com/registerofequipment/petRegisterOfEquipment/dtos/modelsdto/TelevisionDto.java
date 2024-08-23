package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;
import java.util.Objects;

public class TelevisionDto implements Serializable {

    private Integer id;
    private String category;
    private String technology;

    public TelevisionDto(Integer id, String category, String technology) {
        this.id = id;
        this.category = category;
        this.technology = technology;
    }

    public TelevisionDto(){

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
        TelevisionDto that = (TelevisionDto) o;
        return Objects.equals(id, that.id) && Objects.equals(category, that.category) && Objects.equals(technology, that.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, technology);
    }
}
