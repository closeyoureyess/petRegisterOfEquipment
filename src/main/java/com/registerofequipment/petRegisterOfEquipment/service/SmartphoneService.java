package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.SmartphoneDto;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;

import java.util.List;

public interface SmartphoneService {

    Smartphone verifyThatAllFieldsEqual(List<Smartphone> listEquipment, SmartphoneDto equipmentDto);
    List<Smartphone> getAllByFields(SmartphoneDto smartphoneDto);
    SmartphoneDto getEntityById(Integer id);

}
