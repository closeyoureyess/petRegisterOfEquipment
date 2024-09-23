package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;

import java.util.List;

public interface FridgeService {

    FridgeDto getEntityById(Integer id);
    List<Fridge> getAllByFields(FridgeDto fridgeDto);
    Fridge verifyThatAllFieldsEqual(List<Fridge> fridgeEquipment, FridgeDto fridgeDto);

}
