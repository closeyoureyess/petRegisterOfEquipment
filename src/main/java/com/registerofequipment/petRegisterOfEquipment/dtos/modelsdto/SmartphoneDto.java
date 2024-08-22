package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;

public class SmartphoneDto implements Serializable {

    private Integer id;
    private Integer memoryPhone;
    private Integer countsSnaps;

    public SmartphoneDto(Integer id, Integer memoryPhone, Integer countsSnaps) {
        this.id = id;
        this.memoryPhone = memoryPhone;
        this.countsSnaps = countsSnaps;
    }

    public SmartphoneDto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemoryPhone() {
        return memoryPhone;
    }

    public void setMemoryPhone(Integer memoryPhone) {
        this.memoryPhone = memoryPhone;
    }

    public Integer getCountsSnaps() {
        return countsSnaps;
    }

    public void setCountsSnaps(Integer countsSnaps) {
        this.countsSnaps = countsSnaps;
    }
}
