package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.FridgeMapper;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FridgeService implements Verify<Fridge, FridgeDto> {

    @Autowired
    private FridgeMapper fridgeMapper;

    @Override
    public Fridge verifyThatAllFieldsEqual(List<Fridge> fridgeEquipment, FridgeDto fridgeDto) {
        Fridge fridgeForCycle;
        Fridge fridgeAfterCompare = new Fridge();
        for (int i = 0; i < fridgeEquipment.size(); i++) {
            fridgeForCycle = fridgeEquipment.get(i);
            fridgeForCycle.setServiceFlag(ConstantsClass.ZERO_FLAG);
            fridgeAfterCompare = fridgeMapper.compareFridgeAndDto(fridgeDto, fridgeForCycle);
            if (fridgeAfterCompare.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                break;
            }
        }
        return fridgeAfterCompare;
    }
}
