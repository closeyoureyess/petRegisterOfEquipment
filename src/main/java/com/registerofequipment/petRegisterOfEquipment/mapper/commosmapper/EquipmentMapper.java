package com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class EquipmentMapper {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;

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
        }
        return equipmentDto;
    }

    public List<Equipment> transferEquipmentDtoListToEquipment(List<EquipmentDto> equipmentDtoList){
        List<Equipment> equipmentList = new LinkedList<>();
        for (int i = 0; i < equipmentDtoList.size(); i++) {
            equipmentList.add(new Equipment(equipmentDtoList.get(i).getId(), equipmentDtoList.get(i).getNameTypeTechnic(),
                    modelMapper.convertDtoToModel(equipmentDtoList.get(i).getModelDtoDetails()), equipmentDtoList.get(i).getManufacturerCountry(),
                    equipmentDtoList.get(i).getManufacturerCompany(), equipmentDtoList.get(i).getIsOrderOnline(),
                    equipmentDtoList.get(i).getIsPossibilityInstallments(), null));
        }
        return equipmentList;
    }

    public List<EquipmentDto> transferEquipmentToEquipmentDtoList(List<Equipment> equipmentlList){
        List<EquipmentDto> equipmentDtoList = new LinkedList<>();
        for (int i = 0; i < equipmentlList.size(); i++) {
            equipmentDtoList.add(new EquipmentDto(equipmentlList.get(i).getId(), equipmentlList.get(i).getNameTypeTechnic(),
                    modelMapper.convertModelToDto(equipmentlList.get(i).getModelDetails()), equipmentlList.get(i).getManufacturerCountry(),
                    equipmentlList.get(i).getManufacturerCompany(), equipmentlList.get(i).getIsOrderOnline(),
                    equipmentlList.get(i).getIsPossibilityInstallments(), null));
        }
        return equipmentDtoList;
    }
}
