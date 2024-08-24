package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

public class FridgeDto implements Serializable {
    private Integer id;
    private Integer countsDoor;
    private String typeCompressor;
    @OneToOne(mappedBy = "fridge", fetch = FetchType.LAZY)
    private TypesEquipment typesEquipment;


    public FridgeDto(Integer id, Integer countsDoor, String typeCompressor) {
        this.id = id;
        this.countsDoor = countsDoor;
        this.typeCompressor = typeCompressor;
    }

    public FridgeDto(Integer countsDoor, String typeCompressor) {
        this.id = id;
        this.countsDoor = countsDoor;
        this.typeCompressor = typeCompressor;
    }

    public FridgeDto(String typeCompressor) {
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
