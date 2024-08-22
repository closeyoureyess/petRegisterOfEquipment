package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;

public class PersonalComputerDto implements Serializable {
    private Integer id;
    private String typeProcessor;
    private String category;

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
}
