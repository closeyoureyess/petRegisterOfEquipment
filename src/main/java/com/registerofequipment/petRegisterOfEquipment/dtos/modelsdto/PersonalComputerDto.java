package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;
import java.util.Objects;

public class PersonalComputerDto implements Serializable {
    private Integer id;
    private String typeProcessor;
    private String category;
    private Integer serviceFlag;

    public PersonalComputerDto(Integer id, String typeProcessor, String category, Integer serviceFlag) {
        this.id = id;
        this.typeProcessor = typeProcessor;
        this.category = category;
        this.serviceFlag = serviceFlag;
    }

    public PersonalComputerDto(Integer id, String typeProcessor, String category) {
        this.id = id;
        this.typeProcessor = typeProcessor;
        this.category = category;
    }


    public PersonalComputerDto(){

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
        PersonalComputerDto that = (PersonalComputerDto) o;
        return Objects.equals(id, that.id) && Objects.equals(typeProcessor, that.typeProcessor) && Objects.equals(category, that.category) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeProcessor, category, serviceFlag);
    }
}
