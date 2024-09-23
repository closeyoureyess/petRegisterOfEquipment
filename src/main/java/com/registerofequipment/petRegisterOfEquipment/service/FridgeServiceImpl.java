package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.FridgeMapper;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FridgeServiceImpl implements FridgeService {

    @Autowired
    private FridgeMapper fridgeMapper;
    @Autowired
    private FridgeRepository fridgeRepository;

    @Override
    public FridgeDto getEntityById(Integer id) {
        Optional<Fridge> optionalFridge = fridgeRepository.findById(Long.valueOf(id));
        return fridgeMapper.convertFridgeToDto(optionalFridge.get());
    }

    @Override
    public List<Fridge> getAllByFields(FridgeDto fridgeDto){
        Optional<List<Fridge>> resultSearchFridge = Optional.empty();
        if (fridgeDto.getCountsDoor() != null) {
            resultSearchFridge = fridgeRepository.findAllByCountsDoor(fridgeDto.getCountsDoor());
        }
        if (fridgeDto.getTypeCompressor() != null && (resultSearchFridge.isPresent() && !resultSearchFridge.get().isEmpty())){
            resultSearchFridge = fridgeRepository.findAllByTypeCompressor(fridgeDto.getTypeCompressor());
        }
        return resultSearchFridge.get();
    }

    @Override
    public Fridge verifyThatAllFieldsEqual(List<Fridge> fridgeEquipment, FridgeDto fridgeDto) {
        Fridge fridgeForCycle;
        Fridge fridgeAfterCompare = new Fridge();
        for (int i = 0; i < fridgeEquipment.size(); i++) {
            fridgeForCycle = fridgeEquipment.get(i);
            fridgeForCycle.setServiceFlag(ConstantsClass.ZERO_FLAG);
            fridgeAfterCompare = fridgeMapper.compareFridgeAndDto(fridgeDto, fridgeForCycle);
            if (fridgeAfterCompare.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)) {
                break;
            }
        }
        return fridgeAfterCompare;
    }
}
