package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "fridge_tech")
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numbercount_door")
    private Integer countsDoor;
    @Column(name = "compressor_type")
    private String typeCompressor;
    @Transient
    private Integer serviceFlag;

    public Fridge(Integer id, Integer countsDoor, String typeCompressor, Integer serviceFlag) {
        this.id = id;
        this.countsDoor = countsDoor;
        this.typeCompressor = typeCompressor;
        this.serviceFlag = serviceFlag;
    }

    public Fridge(Integer id, Integer countsDoor, String typeCompressor) {
        this.id = id;
        this.countsDoor = countsDoor;
        this.typeCompressor = typeCompressor;
    }

    public Fridge(Integer id, Integer countsDoor){
        this.id = id;
        this.countsDoor = countsDoor;
    }

    public Fridge(Integer countsDoor, String typeCompressor){
        this.countsDoor = countsDoor;
        this.typeCompressor = typeCompressor;
    }

    public Fridge(Integer id){
        this.id = id;
    }

    public Fridge(){

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
        Fridge fridge = (Fridge) o;
        return Objects.equals(id, fridge.id) && Objects.equals(countsDoor, fridge.countsDoor) && Objects.equals(typeCompressor, fridge.typeCompressor) && Objects.equals(serviceFlag, fridge.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countsDoor, typeCompressor, serviceFlag);
    }
}
