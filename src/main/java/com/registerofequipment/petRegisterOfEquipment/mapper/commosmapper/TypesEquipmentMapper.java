package com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TypesEquipmentMapper {

    @Autowired
    private FridgeMapper fridgeMapper;
    @Autowired
    private HooverMapper hooverMapper;
    @Autowired
    private PersonalComputerMapper personalComputerMapper;
    @Autowired
    private SmartphoneMapper smartphoneMapper;
    @Autowired
    private TelevisionMapper televisionMapper;

    public TypesEquipment convertDtoToTypesEquipment(TypesEquipmentDto typesEquipmentDto) {
        TypesEquipment typesEquipment = new TypesEquipment();
        if (typesEquipmentDto != null) {
            typesEquipment.setId(typesEquipmentDto.getId());
            if (typesEquipmentDto.getFridgeDto() != null) {
                typesEquipment.setFridge(fridgeMapper.convertDtoToFridge(typesEquipmentDto.getFridgeDto()));
            }
            if (typesEquipmentDto.getHooverDto() != null) {
                typesEquipment.setHoover(hooverMapper.convertDtoToHoover(typesEquipmentDto.getHooverDto()));
            }
            if (typesEquipmentDto.getPersonalComputerDto() != null) {
                typesEquipment.setPersonalComputer(personalComputerMapper.convertDtoToPersonalComputer(typesEquipmentDto.getPersonalComputerDto()));
            }
            if (typesEquipmentDto.getSmartphoneDto() != null) {
                typesEquipment.setSmartphone(smartphoneMapper.convertDtoToSmartphone(typesEquipmentDto.getSmartphoneDto()));
            }
            if (typesEquipmentDto.getTelevisionDto() != null) {
                typesEquipment.setTelevision(televisionMapper.convertDtoToTelevision(typesEquipmentDto.getTelevisionDto()));
            }
        }
        return typesEquipment;
    }

    public TypesEquipmentDto convertTypesEquipmentToDto(TypesEquipment typesEquipment) {
        TypesEquipmentDto typesEquipmentDto = new TypesEquipmentDto();
        if (typesEquipment != null) {
            typesEquipmentDto.setId(typesEquipment.getId());
            if (typesEquipment.getFridge() != null) {
                typesEquipmentDto.setFridgeDto(fridgeMapper.convertFridgeToDto(typesEquipment.getFridge()));
            }
            if (typesEquipment.getHoover() != null) {
                typesEquipmentDto.setHooverDto(hooverMapper.convertHooverToDto(typesEquipment.getHoover()));
            }
            if (typesEquipment.getPersonalComputer() != null) {
                typesEquipmentDto.setPersonalComputerDto(personalComputerMapper.convertPersonalComputerToDto(typesEquipment.getPersonalComputer()));
            }
            if (typesEquipment.getSmartphone() != null) {
                typesEquipmentDto.setSmartphoneDto(smartphoneMapper.convertSmartphoneToDto(typesEquipment.getSmartphone()));
            }
            if (typesEquipment.getTelevision() != null) {
                typesEquipmentDto.setTelevisionDto(televisionMapper.convertTelevisionToDto(typesEquipment.getTelevision()));
            }
        }
        return typesEquipmentDto;
    }

}
