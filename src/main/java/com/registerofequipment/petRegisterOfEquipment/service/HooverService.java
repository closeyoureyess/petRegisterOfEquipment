package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.HooverDto;
import com.registerofequipment.petRegisterOfEquipment.models.Hoover;

import java.util.List;

public class HooverService implements Verify<Hoover, HooverDto> {
    @Override
    public Hoover verifyThatAllFieldsEqual(List<Hoover> listEquipment, HooverDto equipmentDto) {
        return null;
    }
}
