package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.FridgeMapper;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FridgeService implements CRUDServices<FridgeDto, FridgeDto> {

    @Autowired
    private FridgeRepository fridgeRepository;
    @Autowired
    private FridgeMapper fridgeMapper;


    @Override
    public FridgeDto createPosition(FridgeDto incomingObject) {
        Fridge localFridge = fridgeMapper.convertDtoToFridge(incomingObject);
        localFridge = fridgeRepository.save(localFridge);
        return fridgeMapper.convertFridgeToDto(localFridge);
    }

    @Override
    public FridgeDto getPosition(FridgeDto incomingObject) {
        return null;
    }

    @Override
    public FridgeDto changePosition(FridgeDto incomingObjectForChange) {
        return null;
    }

    @Override
    public FridgeDto deletePosition(FridgeDto deleteObject) {
        return null;
    }
}
