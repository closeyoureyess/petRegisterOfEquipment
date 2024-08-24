package com.registerofequipment.petRegisterOfEquipment.models;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import jakarta.persistence.*;

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
}
