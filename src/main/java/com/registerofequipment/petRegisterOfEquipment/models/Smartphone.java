package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "smartphone_tech")
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "memory")
    private Integer memoryPhone;
    @Column(name = "numbercount_snaps")
    private Integer countsSnaps;
    @Transient
    private Integer serviceFlag;

    public Smartphone(Integer id, Integer memoryPhone, Integer countsSnaps, Integer serviceFlag) {
        this.id = id;
        this.memoryPhone = memoryPhone;
        this.countsSnaps = countsSnaps;
        this.serviceFlag = serviceFlag;
    }


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
        Smartphone that = (Smartphone) o;
        return Objects.equals(id, that.id) && Objects.equals(memoryPhone, that.memoryPhone) && Objects.equals(countsSnaps, that.countsSnaps) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memoryPhone, countsSnaps, serviceFlag);
    }
}
