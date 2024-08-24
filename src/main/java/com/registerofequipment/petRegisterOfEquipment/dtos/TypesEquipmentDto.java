package com.registerofequipment.petRegisterOfEquipment.dtos;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.*;
import com.registerofequipment.petRegisterOfEquipment.models.*;

import java.io.Serializable;
import java.util.Objects;

public class TypesEquipmentDto implements Serializable {

    private Integer id;
    private FridgeDto fridgeDto;
    private HooverDto hooverDto;
    private PersonalComputerDto personalComputerDto;
    private SmartphoneDto smartphoneDto;
    private TelevisionDto televisionDto;

    public TypesEquipmentDto(Integer id, FridgeDto fridgeDto, HooverDto hooverDto, PersonalComputerDto personalComputerDto, SmartphoneDto smartphoneDto, TelevisionDto televisionDto) {
        this.id = id;
        this.fridgeDto = fridgeDto;
        this.hooverDto = hooverDto;
        this.personalComputerDto = personalComputerDto;
        this.smartphoneDto = smartphoneDto;
        this.televisionDto = televisionDto;
    }

    public TypesEquipmentDto(FridgeDto fridgeDto) {
        this.fridgeDto = fridgeDto;
    }

    public TypesEquipmentDto(HooverDto hooverDto) {
        this.hooverDto = hooverDto;
    }

    public TypesEquipmentDto(PersonalComputerDto personalComputerDto) {
        this.personalComputerDto = personalComputerDto;
    }

    public TypesEquipmentDto(SmartphoneDto smartphoneDto) {
        this.smartphoneDto = smartphoneDto;
    }

    public TypesEquipmentDto(TelevisionDto televisionDto){
        this.televisionDto = televisionDto;
    }

    public TypesEquipmentDto(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FridgeDto getFridgeDto() {
        return fridgeDto;
    }

    public void setFridgeDto(FridgeDto fridgeDto) {
        this.fridgeDto = fridgeDto;
    }

    public HooverDto getHooverDto() {
        return hooverDto;
    }

    public void setHooverDto(HooverDto hooverDto) {
        this.hooverDto = hooverDto;
    }

    public PersonalComputerDto getPersonalComputerDto() {
        return personalComputerDto;
    }

    public void setPersonalComputerDto(PersonalComputerDto personalComputerDto) {
        this.personalComputerDto = personalComputerDto;
    }

    public SmartphoneDto getSmartphoneDto() {
        return smartphoneDto;
    }

    public void setSmartphoneDto(SmartphoneDto smartphoneDto) {
        this.smartphoneDto = smartphoneDto;
    }

    public TelevisionDto getTelevisionDto() {
        return televisionDto;
    }

    public void setTelevisionDto(TelevisionDto televisionDto) {
        this.televisionDto = televisionDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypesEquipmentDto that = (TypesEquipmentDto) o;
        return Objects.equals(id, that.id) && Objects.equals(fridgeDto, that.fridgeDto) && Objects.equals(hooverDto, that.hooverDto) && Objects.equals(personalComputerDto, that.personalComputerDto) && Objects.equals(smartphoneDto, that.smartphoneDto) && Objects.equals(televisionDto, that.televisionDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fridgeDto, hooverDto, personalComputerDto, smartphoneDto, televisionDto);
    }
}
