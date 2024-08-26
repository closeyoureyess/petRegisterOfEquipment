package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.SmartphoneDto;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;

import java.util.List;

public class SmartphoneService implements Verify<Smartphone, SmartphoneDto> {
    @Override
    public Smartphone verifyThatAllFieldsEqual(List<Smartphone> listEquipment, SmartphoneDto equipmentDto) {
        return null;
    }
}
