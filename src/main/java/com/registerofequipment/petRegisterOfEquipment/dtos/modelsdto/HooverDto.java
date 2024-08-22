package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import java.io.Serializable;
import java.util.Objects;


public class HooverDto implements Serializable {

    private Integer id;
    private Integer sizeDustCollect;
    private Integer countsRegime;

    public HooverDto(Integer id, Integer sizeDustCollect, Integer countsRegime) {
        this.id = id;
        this.sizeDustCollect = sizeDustCollect;
        this.countsRegime = countsRegime;
    }

    public HooverDto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSizeDustCollect() {
        return sizeDustCollect;
    }

    public void setSizeDustCollect(Integer sizeDustCollect) {
        this.sizeDustCollect = sizeDustCollect;
    }

    public Integer getCountsRegime() {
        return countsRegime;
    }

    public void setCountsRegime(Integer countsRegime) {
        this.countsRegime = countsRegime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HooverDto hooverDto = (HooverDto) o;
        return Objects.equals(id, hooverDto.id) && Objects.equals(sizeDustCollect, hooverDto.sizeDustCollect) && Objects.equals(countsRegime, hooverDto.countsRegime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sizeDustCollect, countsRegime);
    }
}
