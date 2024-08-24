package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import org.springframework.stereotype.Component;

@Component
public class FridgeMapper {

    public Fridge convertDtoToFridge(FridgeDto fridgeDto) {
        Fridge fridge = new Fridge();
        if (fridgeDto != null) {
            fridge.setId(fridgeDto.getId());
            fridge.setCountsDoor(fridgeDto.getCountsDoor());
            fridge.setTypeCompressor(fridgeDto.getTypeCompressor());
        }
        return fridge;
    }

    public FridgeDto convertFridgeToDto(Fridge fridge) {
        FridgeDto fridgeDto = new FridgeDto();
        if (fridge != null) {
            fridgeDto.setId(fridge.getId());
            fridgeDto.setCountsDoor(fridge.getCountsDoor());
            fridgeDto.setTypeCompressor(fridge.getTypeCompressor());
        }
        return fridgeDto;
    }

    public Fridge compareFridgeAndDto(FridgeDto fridgeDto, Fridge fridge) {
        if (fridge != null && fridgeDto != null) {
            if (!fridgeDto.getCountsDoor().equals(fridge.getCountsDoor())) {
                fridge.setCountsDoor(fridgeDto.getCountsDoor());
            }
            if (!fridgeDto.getTypeCompressor().equals(fridge.getTypeCompressor())) {
                fridge.setTypeCompressor(fridgeDto.getTypeCompressor());
            }
        }
        return fridge;
    }
}
