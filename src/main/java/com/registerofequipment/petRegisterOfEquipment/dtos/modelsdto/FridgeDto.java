package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;

public class FridgeDto implements Serializable {
    private Integer id;
    private Integer countsDoor;
    private String typeCompressor;

    public FridgeDto(Integer id, Integer countsDoor, String typeCompressor) {
        this.id = id;
        this.countsDoor = countsDoor;
        this.typeCompressor = typeCompressor;
    }

    public FridgeDto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountsDoor() {
        return countsDoor;
    }

    public void setCountsDoor(Integer countsDoor) {
        this.countsDoor = countsDoor;
    }

    public String getTypeCompressor() {
        return typeCompressor;
    }

    public void setTypeCompressor(String typeCompressor) {
        this.typeCompressor = typeCompressor;
    }
}
