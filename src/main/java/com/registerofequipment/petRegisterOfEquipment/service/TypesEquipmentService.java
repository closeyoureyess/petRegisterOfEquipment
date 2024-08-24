package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.TypesEquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.repository.TypesEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TypesEquipmentService implements CRUDServices<TypesEquipmentDto, TypesEquipmentDto> {

    @Autowired
    private TypesEquipmentRepository typesEquipmentRepository;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;

    @Override
    public TypesEquipmentDto createPosition(TypesEquipmentDto incomingObject) {
        return null;
    }

    @Override
    public TypesEquipmentDto getPosition(TypesEquipmentDto incomingObject) {
        return null;
    }

    @Override
    public TypesEquipmentDto changePosition(TypesEquipmentDto incomingObjectForChange) {
        return null;
    }

    @Override
    public TypesEquipmentDto deletePosition(TypesEquipmentDto deleteObject) {
        return null;
    }
}
