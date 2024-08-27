package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import org.springframework.stereotype.Component;

@Component
public class FridgeMapper {

    public Fridge convertDtoToFridge(FridgeDto fridgeDto) {
        Fridge fridge = new Fridge();
        if (fridgeDto != null) {
            fridge.setId(fridgeDto.getId());
            if (fridgeDto.getCountsDoor() != null) {
                fridge.setCountsDoor(fridgeDto.getCountsDoor());
            }
            if (fridgeDto.getTypeCompressor() != null) {
                fridge.setTypeCompressor(fridgeDto.getTypeCompressor());
            }
        }
        return fridge;
    }

    public FridgeDto convertFridgeToDto(Fridge fridge) {
        FridgeDto fridgeDto = new FridgeDto();
        if (fridge != null) {
            fridgeDto.setId(fridge.getId());
            if (fridge.getCountsDoor() != null) {
                fridgeDto.setCountsDoor(fridge.getCountsDoor());
            }
            if (fridge.getTypeCompressor() != null) {
                fridgeDto.setTypeCompressor(fridge.getTypeCompressor());
            }
        }
        return fridgeDto;
    }

    public Fridge compareFridgeAndDto(FridgeDto fridgeDto, Fridge fridge) {
        if (fridge != null && fridgeDto != null) {
            fridge = compareCountsDoorAndDto(fridgeDto, fridge);
            fridge = compareTypeCompressor(fridgeDto, fridge);
        }
        return fridge;
    }
    private Fridge compareCountsDoorAndDto(FridgeDto fridgeDto, Fridge fridge){
        if (!fridgeDto.getCountsDoor().equals(fridge.getCountsDoor())) {
            fridge.setServiceFlag(ConstantsClass.ONE_FLAG);
            fridge.setCountsDoor(fridgeDto.getCountsDoor());
        }
        return fridge;
    }

    private Fridge compareTypeCompressor(FridgeDto fridgeDto, Fridge fridge){
        if (!fridgeDto.getTypeCompressor().equals(fridge.getTypeCompressor())) {
            fridge.setServiceFlag(ConstantsClass.ONE_FLAG);
            fridge.setTypeCompressor(fridgeDto.getTypeCompressor());
        }
        return fridge;
    }
}
