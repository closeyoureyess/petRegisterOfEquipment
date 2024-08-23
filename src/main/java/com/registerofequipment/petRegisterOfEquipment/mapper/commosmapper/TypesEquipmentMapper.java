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
            typesEquipment.setId(typesEquipment.getId());
            typesEquipment.setFridge(fridgeMapper.convertDtoToFridge(typesEquipmentDto.getFridgeDto()));
            typesEquipment.setHoover(hooverMapper.convertDtoToHoover(typesEquipmentDto.getHooverDto()));
            typesEquipment.setPersonalComputer(personalComputerMapper.convertDtoToPersonalComputer(typesEquipmentDto.getPersonalComputerDto()));
            typesEquipment.setSmartphone(smartphoneMapper.convertDtoToSmartphone(typesEquipmentDto.getSmartphoneDto()));
            typesEquipment.setTelevision(televisionMapper.convertDtoToTelevision(typesEquipmentDto.getTelevisionDto()));
        }
        return typesEquipment;
    }

    public TypesEquipmentDto convertTypesEquipmentToDto(TypesEquipment typesEquipment){
        TypesEquipmentDto typesEquipmentDto = new TypesEquipmentDto();
        if (typesEquipment != null){
            typesEquipmentDto.setId(typesEquipment.getId());
            typesEquipmentDto.setFridgeDto(fridgeMapper.convertFridgeToDto(typesEquipment.getFridge()));
            typesEquipmentDto.setHooverDto(hooverMapper.convertHooverToDto(typesEquipment.getHoover()));
            typesEquipmentDto.setPersonalComputerDto(personalComputerMapper.convertPersonalComputerToDto(typesEquipment.getPersonalComputer()));
            typesEquipmentDto.setSmartphoneDto(smartphoneMapper.convertSmartphoneToDto(typesEquipment.getSmartphone()));
            typesEquipmentDto.setTelevisionDto(televisionMapper.convertTelevisionToDto(typesEquipment.getTelevision()));
        }
        return typesEquipmentDto;
    }

}
