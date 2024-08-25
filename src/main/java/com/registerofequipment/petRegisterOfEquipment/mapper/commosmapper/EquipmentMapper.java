package com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
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
            if (equipmentDto.getNameTypeTechnic() != null) {
                equipment.setNameTypeTechnic(equipmentDto.getNameTypeTechnic());
            }
            if (equipmentDto.getManufacturerCountry() != null) {
                equipment.setManufacturerCountry(equipmentDto.getManufacturerCountry());
            }
            if (equipmentDto.getManufacturerCompany() != null) {
                equipment.setManufacturerCompany(equipmentDto.getManufacturerCompany());
            }
            if (equipmentDto.getIsOrderOnline() != null) {
                equipment.setIsOrderOnline(equipmentDto.getIsOrderOnline());
            }
            if (equipmentDto.getIsPossibilityInstallments() != null) {
                equipment.setIsPossibilityInstallments(equipmentDto.getIsPossibilityInstallments());
            }
            equipment.setServiceFlag(equipmentDto.getServiceFlag());
        }
        return equipment;
    }

    public EquipmentDto convertEquipmentToDto(Equipment equipment) {
        EquipmentDto equipmentDto = new EquipmentDto();
        if (equipment != null) {
            equipmentDto.setId(equipment.getId());
            equipmentDto.setNameTypeTechnic(equipment.getNameTypeTechnic());
            equipmentDto.setManufacturerCountry(equipment.getManufacturerCountry());
            equipmentDto.setManufacturerCompany(equipment.getManufacturerCompany());
            equipmentDto.setIsOrderOnline(equipment.getIsOrderOnline());
            equipmentDto.setIsPossibilityInstallments(equipment.getIsPossibilityInstallments());
            equipmentDto.setServiceFlag(equipment.getServiceFlag());
        }
        return equipmentDto;
    }

    public Equipment compareEquipmentAndDto(EquipmentDto equipmentDto, Equipment equipment){
        if (equipmentDto != null && equipment != null){
            equipment = compareManufacturerCountryEquipmentAndDto(equipmentDto, equipment);
            equipment = compareManufacturerCompanyEquipmentAndDto(equipmentDto, equipment);
            equipment = compareIsPossibilityInstallmentsEquipmentAndDto(equipmentDto, equipment);
            equipment = compareIsOnlineEquipmentAndDto(equipmentDto, equipment);
            equipment = compareNameTypeTechnicEquipmentAndDto(equipmentDto,equipment);
        }
        return equipment;
    }

    private Equipment compareManufacturerCountryEquipmentAndDto(EquipmentDto equipmentDto, Equipment equipment){
        if (!equipmentDto.getManufacturerCountry().equals(equipment.getManufacturerCountry())){
            equipment.setServiceFlag(ConstantsClass.ONE_FLAG);
            equipment.setManufacturerCountry(equipmentDto.getManufacturerCountry());
        }
        return equipment;
    }

    private Equipment compareManufacturerCompanyEquipmentAndDto(EquipmentDto equipmentDto, Equipment equipment){
        if (!equipmentDto.getManufacturerCompany().equals(equipment.getManufacturerCompany())){
            equipment.setServiceFlag(ConstantsClass.ONE_FLAG);
            equipment.setManufacturerCompany(equipmentDto.getManufacturerCompany());
        }
        return equipment;
    }

    private Equipment compareIsPossibilityInstallmentsEquipmentAndDto(EquipmentDto equipmentDto, Equipment equipment){
        if (equipmentDto.getIsPossibilityInstallments() != equipment.getIsPossibilityInstallments()){
            equipment.setServiceFlag(ConstantsClass.ONE_FLAG);
            equipment.setIsPossibilityInstallments(equipmentDto.getIsPossibilityInstallments());
        }
        return equipment;
    }

    private Equipment compareIsOnlineEquipmentAndDto(EquipmentDto equipmentDto, Equipment equipment){
        if(equipmentDto.getIsOrderOnline().equals(equipment.getIsOrderOnline())){
            equipment.setServiceFlag(ConstantsClass.ONE_FLAG);
            equipment.setIsOrderOnline(equipmentDto.getIsOrderOnline());
        }
        return equipment;
    }

    private Equipment compareNameTypeTechnicEquipmentAndDto(EquipmentDto equipmentDto, Equipment equipment){
        if (equipmentDto.getNameTypeTechnic().equals(equipment.getNameTypeTechnic())){
            equipment.setServiceFlag(ConstantsClass.ONE_FLAG);
            equipment.setNameTypeTechnic(equipmentDto.getNameTypeTechnic());
        }
        return equipment;
    }

    public List<Equipment> transferEquipmentDtoListToEquipment(List<EquipmentDto> equipmentDtoList) {
        List<Equipment> equipmentList = new LinkedList<>();
        if (equipmentDtoList != null) {
            for (int i = 0; i < equipmentDtoList.size(); i++) {
                equipmentList.add(new Equipment(equipmentDtoList.get(i).getId(), equipmentDtoList.get(i).getNameTypeTechnic(),
                        equipmentDtoList.get(i).getManufacturerCountry(), equipmentDtoList.get(i).getManufacturerCompany(),
                        equipmentDtoList.get(i).getIsOrderOnline(), equipmentDtoList.get(i).getIsPossibilityInstallments()));
            }
        }
        return equipmentList;
    }

    public List<EquipmentDto> transferEquipmentToEquipmentDtoList(List<Equipment> equipmentlList) {
        List<EquipmentDto> equipmentDtoList = new LinkedList<>();
        if (equipmentlList != null) {
            for (int i = 0; i < equipmentlList.size(); i++) {
                equipmentDtoList.add(new EquipmentDto(equipmentlList.get(i).getId(), equipmentlList.get(i).getNameTypeTechnic(),
                        equipmentlList.get(i).getManufacturerCountry(), equipmentlList.get(i).getManufacturerCompany(),
                        equipmentlList.get(i).getIsOrderOnline(), equipmentlList.get(i).getIsPossibilityInstallments()));
            }
        }
        return equipmentDtoList;
    }
}
