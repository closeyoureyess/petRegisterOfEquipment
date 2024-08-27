package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.TypesEquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DifferentTypesEquipmentExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.FieldsEmptyExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.NameTypeTechnicExeption;
import com.registerofequipment.petRegisterOfEquipment.repository.TypesEquipmentRepository;
import com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces.CRUDServices;
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
    public TypesEquipmentDto createPosition(TypesEquipmentDto incomingObject) throws NameTypeTechnicExeption, DifferentTypesEquipmentExeption, FieldsEmptyExeption {
        TypesEquipment typesEquipment = typesEquipmentMapper.convertDtoToTypesEquipment(incomingObject);
        typesEquipment = typesEquipmentRepository.save(typesEquipment);
        return typesEquipmentMapper.convertTypesEquipmentToDto(typesEquipment);
    }

    @Override
    public Optional<List<TypesEquipmentDto>> getPositionPageByPage(String incomingObject, Integer offset, Integer limit) {
        return null;
    }

    public TypesEquipment getTypesWithFridgeEntity(Integer fridgeId){
        return typesEquipmentRepository.findByFridgeId(Long.valueOf(fridgeId));
    }

    public TypesEquipment getTypesWithHooverEntity(Integer hooverId) {
        return typesEquipmentRepository.findByHooverId(Long.valueOf(hooverId));
    }

    public TypesEquipment getTypesWithPersonalComputerEntity(Integer personalComputerId){
        return typesEquipmentRepository.findByPersonalComputerId(Long.valueOf(personalComputerId));
    }

    public TypesEquipment getTypesWithSmartphoneEntity(Integer smartphoneId){
        return typesEquipmentRepository.findBySmartphoneId(Long.valueOf(smartphoneId));
    }

    public TypesEquipment getTypesWithTelevisionEntity(Integer televisionId){
        return typesEquipmentRepository.findByTelevisionId(Long.valueOf(televisionId));
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
