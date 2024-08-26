package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.TelevisionDto;
import com.registerofequipment.petRegisterOfEquipment.models.Television;

import java.util.List;

public class TelevisionService implements Verify<Television, TelevisionDto> {
    @Override
    public Television verifyThatAllFieldsEqual(List<Television> listEquipment, TelevisionDto equipmentDto) {
        return null;
    }
}
