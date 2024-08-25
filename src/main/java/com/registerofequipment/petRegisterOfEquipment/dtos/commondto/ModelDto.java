package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;

import java.io.Serializable;
import java.util.Objects;

public class ModelDto implements Serializable {

    private Integer id;
    private String nameDevice;
    private TypesEquipmentDto typesEquipmentDto;
    private EquipmentDto equipmentDto;
    private Integer serialNumber;
    private ColorEquipment color;
    private Integer size;
    private Integer price;
    private Boolean isAvailability;

    public ModelDto(Integer id, String nameDevice, TypesEquipmentDto typesEquipmentDto,
                    EquipmentDto equipmentDto, Integer serialNumber, ColorEquipment color, Integer size, Integer price, Boolean isAvailability) {
        this.id = id;
        this.nameDevice = nameDevice;
        this.typesEquipmentDto = typesEquipmentDto;
        this.equipmentDto = equipmentDto;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isAvailability = isAvailability;
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

    public TypesEquipmentDto getTypesEquipmentDto() {
        return typesEquipmentDto;
    }

    public void setTypesEquipmentDto(TypesEquipmentDto typesEquipmentDto) {
        this.typesEquipmentDto = typesEquipmentDto;
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

    public Boolean getIsAvailability() {
        return isAvailability;
    }

    public void setAvailability(Boolean availability) {
        isAvailability = availability;
    }

    public EquipmentDto getEquipmentDto() {
        return equipmentDto;
    }

    public void setEquipmentDto(EquipmentDto equipmentDto) {
        this.equipmentDto = equipmentDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelDto modelDto = (ModelDto) o;
        return Objects.equals(id, modelDto.id) && Objects.equals(nameDevice, modelDto.nameDevice) && Objects.equals(typesEquipmentDto, modelDto.typesEquipmentDto) && Objects.equals(equipmentDto, modelDto.equipmentDto) && Objects.equals(serialNumber, modelDto.serialNumber) && color == modelDto.color && Objects.equals(size, modelDto.size) && Objects.equals(price, modelDto.price) && Objects.equals(isAvailability, modelDto.isAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameDevice, typesEquipmentDto, equipmentDto, serialNumber, color, size, price, isAvailability);
    }
}
