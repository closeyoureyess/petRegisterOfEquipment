package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;

import java.io.Serializable;
import java.util.List;

public class ModelDto implements Serializable {

    private Integer id;
    private String nameDevice;
    private TypesEquipment typesEquipment;
    private Integer serialNumber;
    private ColorEquipment color;
    private Integer size;
    private Integer price;
    private boolean isAvailability;
    private List<Equipment> equipmentList;

    public ModelDto(Integer id, String nameDevice, TypesEquipment typesEquipment, Integer serialNumber, ColorEquipment color, Integer size, Integer price, boolean isAvailability, List<Equipment> equipmentList) {
        this.id = id;
        this.nameDevice = nameDevice;
        this.typesEquipment = typesEquipment;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isAvailability = isAvailability;
        this.equipmentList = equipmentList;
    }

    public ModelDto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public TypesEquipment getTypesEquipment() {
        return typesEquipment;
    }

    public void setTypesEquipment(TypesEquipment typesEquipment) {
        this.typesEquipment = typesEquipment;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ColorEquipment getColor() {
        return color;
    }

    public void setColor(ColorEquipment color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return isAvailability;
    }

    public void setAvailability(boolean availability) {
        isAvailability = availability;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
