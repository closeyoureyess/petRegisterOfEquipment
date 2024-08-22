package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "hoover_tech")
public class Hoover {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "size_dust_collect")
    private Integer sizeDustCollect;
    @Column(name = "numbercount_regime")
    private Integer countsRegime;

    public Hoover(Integer id, Integer sizeDustCollect, Integer countsRegime) {
        this.id = id;
        this.sizeDustCollect = sizeDustCollect;
        this.countsRegime = countsRegime;
    }

    public Hoover(){

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
        Hoover hoover = (Hoover) o;
        return Objects.equals(id, hoover.id) && Objects.equals(sizeDustCollect, hoover.sizeDustCollect) && Objects.equals(countsRegime, hoover.countsRegime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sizeDustCollect, countsRegime);
    }
}
