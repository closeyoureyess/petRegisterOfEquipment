package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.EquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService implements CRUDServices<EquipmentDto, EquipmentDto> {

    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private ModelService modelService;

    @Override
    public EquipmentDto createPosition(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentMapper.convertDtoToEquipment(equipmentDto);
        equipment = equipmentRepository.save(equipment);
        return equipmentMapper.convertEquipmentToDto(equipment);
    }

    @Override
    public List<EquipmentDto> getPosition(String equipmentDto, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public EquipmentDto changePosition(EquipmentDto equipmentDto) {
        return null;
    }

    @Override
    public boolean deletePosition(Integer equipmentDto) {
        return true;
    }

    public EquipmentDto searchForExistingEquipment(EquipmentDto equipmentDto) {
        List<Equipment> listEquipment = equipmentRepository.findAllByNameTypeTechnic(String.valueOf(equipmentMapper.convertDtoToEquipment(
                equipmentDto).getNameTypeTechnic()));
        Equipment equipmentForCycle;
        Equipment equipmentAfterCompare = new Equipment();
        for (int i = 0; i < listEquipment.size(); i++) {
            equipmentForCycle = listEquipment.get(i);
            equipmentForCycle.setServiceFlag(ConstantsClass.ZERO_FLAG);
            equipmentAfterCompare = equipmentMapper.compareEquipmentAndDto(equipmentDto, equipmentForCycle);
            if (equipmentAfterCompare.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)) {
                break;
            }
        }
        return equipmentMapper.convertEquipmentToDto(equipmentAfterCompare);
    }

}
