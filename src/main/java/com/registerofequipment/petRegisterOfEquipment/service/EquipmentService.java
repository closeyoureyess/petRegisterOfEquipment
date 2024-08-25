package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.EquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService implements CRUDServices<EquipmentDto, EquipmentDto> {

    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public EquipmentDto createPosition(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentMapper.convertDtoToEquipment(equipmentDto);
        equipment = equipmentRepository.save(equipment);
        return equipmentMapper.convertEquipmentToDto(equipment);
    }

    @Override
    public Optional<List<EquipmentDto>> getPosition(String nameTypeTechnic, Integer offset, Integer limit) {
        if (offset != null && limit != null) {
            Pageable pageble = PageRequest.of(offset, limit);
            Page<Equipment> pageModel = equipmentRepository.findAllByNameTypeTechnic(nameTypeTechnic, pageble);
            return Optional.of(equipmentMapper.transferEquipmentToEquipmentDtoList(pageModel.stream().toList()));
        } else if (offset == null && limit == null) {
            return Optional.of(equipmentMapper.transferEquipmentToEquipmentDtoList(equipmentRepository.findAllByNameTypeTechnic(nameTypeTechnic)));
        }
        return Optional.empty();
    }

    @Override
    public EquipmentDto changePosition(EquipmentDto equipmentDto) {

        return null;
    }

    @Override
    public boolean deletePosition(Integer equipmentDto) {
        return true;
    }

    public EquipmentDto verifyThatAllFieldsEqual(List<Equipment> listEquipment, EquipmentDto equipmentDto) {
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
