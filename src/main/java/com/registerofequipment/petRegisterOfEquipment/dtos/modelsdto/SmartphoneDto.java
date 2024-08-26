package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;
import java.util.Objects;

public class SmartphoneDto implements Serializable {

    private Integer id;
    private Integer memoryPhone;
    private Integer countsSnaps;
    private Integer serviceFlag;

    public SmartphoneDto(Integer id, Integer memoryPhone, Integer countsSnaps, Integer serviceFlag) {
        this.id = id;
        this.memoryPhone = memoryPhone;
        this.countsSnaps = countsSnaps;
        this.serviceFlag = serviceFlag;
    }

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
        SmartphoneDto that = (SmartphoneDto) o;
        return Objects.equals(id, that.id) && Objects.equals(memoryPhone, that.memoryPhone) && Objects.equals(countsSnaps, that.countsSnaps) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memoryPhone, countsSnaps, serviceFlag);
    }
}
