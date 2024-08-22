package com.registerofequipment.petRegisterOfEquipment.mapper;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;

public class EquipmentMapper {

    public Equipment convertDtoToEquipment(EquipmentDto equipmentDto){
        Equipment equipment = new Equipment();
        return equipment;
    }

    public EquipmentDto convertEquipmentToDto(Equipment equipment){
        EquipmentDto equipmentDto = new EquipmentDto();
        return equipmentDto;
    }
}
