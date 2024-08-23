package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;

@Entity
@Table(name = "smartphone_tech_tech")
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "memory")
    private Integer memoryPhone;
    @Column(name = "numbercount_snaps")
    private Integer countsSnaps;

    public Smartphone(Integer id, Integer memoryPhone, Integer countsSnaps) {
        this.id = id;
        this.memoryPhone = memoryPhone;
        this.countsSnaps = countsSnaps;
    }

    public Smartphone(Integer id, Integer memoryPhone) {
        this.id = id;
        this.memoryPhone = memoryPhone;
    }

    public Smartphone(Integer id) {
        this.id = id;

    }

    public Smartphone(){

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
