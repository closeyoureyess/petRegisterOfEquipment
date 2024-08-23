package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.SmartphoneDto;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import org.springframework.stereotype.Component;

@Component
public class SmartphoneMapper {

    public Smartphone convertDtoToSmartphone(SmartphoneDto smartphoneDto){
        Smartphone smartphone = new Smartphone();
        if (smartphoneDto != null){
            smartphone.setId(smartphoneDto.getId());
            smartphone.setCountsSnaps(smartphoneDto.getCountsSnaps());
            smartphone.setMemoryPhone(smartphoneDto.getMemoryPhone());
        }
        return smartphone;
    }

    public SmartphoneDto convertSmartphoneToDto(Smartphone smartphone){
        SmartphoneDto smartphoneDto = new SmartphoneDto();
        if (smartphone != null){
            smartphoneDto.setId(smartphone.getId());
            smartphoneDto.setCountsSnaps(smartphone.getCountsSnaps());
            smartphoneDto.setMemoryPhone(smartphone.getMemoryPhone());
        }
        return smartphoneDto;
    }

}
