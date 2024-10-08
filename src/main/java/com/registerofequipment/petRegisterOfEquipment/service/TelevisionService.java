package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.TelevisionDto;
import com.registerofequipment.petRegisterOfEquipment.models.Television;

import java.util.List;

public interface TelevisionService {

    Television verifyThatAllFieldsEqual(List<Television> listEquipment, TelevisionDto televisionDto);
    List<Television> getAllByFields(TelevisionDto televisionDto);
    TelevisionDto getEntityById(Integer id);

}
