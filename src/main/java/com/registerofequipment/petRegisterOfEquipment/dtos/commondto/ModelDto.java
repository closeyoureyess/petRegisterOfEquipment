package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;

import java.io.Serializable;
import java.util.List;

public class ModelDto implements Serializable {

    private Integer id;
    private String nameDevice;
    private TypesEquipmentDto typesEquipmentDto;
    private Integer serialNumber;
    private ColorEquipment color;
    private Integer size;
    private Integer price;
    private boolean isAvailability;
    private List<EquipmentDto> equipmentListDto;

    public ModelDto(Integer id, String nameDevice, TypesEquipmentDto typesEquipmentDto, Integer serialNumber, ColorEquipment color, Integer size,
                    Integer price, boolean isAvailability, List<EquipmentDto> equipmentListDto) {
        this.id = id;
        this.nameDevice = nameDevice;
        this.typesEquipmentDto = typesEquipmentDto;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isAvailability = isAvailability;
        this.equipmentListDto = equipmentListDto;
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

    public boolean getIsAvailability() {
        return isAvailability;
    }

    public void setAvailability(boolean availability) {
        isAvailability = availability;
    }

    public List<EquipmentDto> getEquipmentListDto() {
        return equipmentListDto;
    }

    public void setEquipmentListDto(List<EquipmentDto> equipmentListDto) {
        this.equipmentListDto = equipmentListDto;
    }
}
