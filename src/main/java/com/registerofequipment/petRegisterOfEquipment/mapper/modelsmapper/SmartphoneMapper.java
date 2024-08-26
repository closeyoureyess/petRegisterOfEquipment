package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.SmartphoneDto;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
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

    public Smartphone compareHooverAndDto(SmartphoneDto smartphoneDto, Smartphone smartphone) {
        if (smartphone != null && smartphoneDto != null) {
            smartphone = compareTypeProcessorAndDto(smartphoneDto, smartphone);
            smartphone = compareCategoryAndDto(smartphoneDto, smartphone);
        }
        return smartphone;
    }
    private Smartphone compareTypeProcessorAndDto(SmartphoneDto smartphoneDto, Smartphone smartphone){
        if (!smartphoneDto.getMemoryPhone().equals(smartphone.getMemoryPhone())) {
            smartphone.setServiceFlag(ConstantsClass.ONE_FLAG);
            smartphone.setMemoryPhone(smartphoneDto.getMemoryPhone());
        }
        return smartphone;
    }

    private Smartphone compareCategoryAndDto(SmartphoneDto smartphoneDto, Smartphone smartphone){
        if (!smartphoneDto.getCountsSnaps().equals(smartphone.getCountsSnaps())) {
            smartphone.setServiceFlag(ConstantsClass.ONE_FLAG);
            smartphone.setCountsSnaps(smartphoneDto.getCountsSnaps());
        }
        return smartphone;
    }

}
