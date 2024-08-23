package com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EquipmentMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Equipment convertDtoToEquipment(EquipmentDto equipmentDto) {
        Equipment equipment = new Equipment();
        if (equipmentDto != null) {
            equipment.setId(equipmentDto.getId());
            equipment.setNameTypeTechnic(equipmentDto.getNameTypeTechnic());
            equipment.setModelDetails(modelMapper.convertDtoToModel(equipmentDto.getModelDtoDetails()));
            equipment.setManufacturerCountry(equipmentDto.getManufacturerCountry());
            equipment.setManufacturerCompany(equipmentDto.getManufacturerCompany());
            equipment.setIsOrderOnline(equipmentDto.getIsOrderOnline());
            equipment.setIsPossibilityInstallments(equipmentDto.getIsPossibilityInstallments());
            equipment.setModelsAvailability(equipmentDto.getModelsAvailabilityDto());
        }
        return equipment;
    }

    public EquipmentDto convertEquipmentToDto(Equipment equipment) {
        EquipmentDto equipmentDto = new EquipmentDto();
        if (equipment != null) {
            equipmentDto.setId(equipmentDto.getId());
            equipmentDto.setNameTypeTechnic(equipment.getNameTypeTechnic());
            equipmentDto.setModelDtoDetails(modelMapper.convertModelToDto(equipment.getModelDetails()));
            equipmentDto.setManufacturerCountry(equipment.getManufacturerCountry());
            equipmentDto.setManufacturerCompany(equipment.getManufacturerCompany());
            equipmentDto.setIsOrderOnline(equipment.getIsOrderOnline());
            equipmentDto.setIsPossibilityInstallments(equipment.getIsPossibilityInstallments());
            equipmentDto.setModelsAvailabilityDto(equipment.getModelsAvailability());
        }
        return equipmentDto;
    }
}
