package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.TypesEquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.repository.TypesEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypesEquipmentService implements CRUDServices<TypesEquipmentDto, TypesEquipmentDto> {

    @Autowired
    private TypesEquipmentRepository typesEquipmentRepository;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;

    @Override
    public TypesEquipmentDto createPosition(TypesEquipmentDto incomingObject) {
        TypesEquipment typesEquipment = typesEquipmentMapper.convertDtoToTypesEquipment(incomingObject);
        typesEquipment = typesEquipmentRepository.save(typesEquipment);
        return typesEquipmentMapper.convertTypesEquipmentToDto(typesEquipment);
    }

    @Override
    public Optional<List<TypesEquipmentDto>> getPosition(String incomingObject, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public TypesEquipmentDto changePosition(TypesEquipmentDto incomingObjectForChange) {
        return null;
    }

    @Override
    public boolean deletePosition(Integer deleteObject) {
        return true;
    }
}
