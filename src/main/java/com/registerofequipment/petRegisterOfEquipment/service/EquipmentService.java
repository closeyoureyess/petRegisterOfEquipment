package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.EquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public EquipmentDto getPosition(EquipmentDto equipmentDto) {
        return null;
    }

    @Override
    public EquipmentDto changePosition(EquipmentDto equipmentDto) {
        return null;
    }

    @Override
    public EquipmentDto deletePosition(EquipmentDto equipmentDto) {
        return null;
    }

}
