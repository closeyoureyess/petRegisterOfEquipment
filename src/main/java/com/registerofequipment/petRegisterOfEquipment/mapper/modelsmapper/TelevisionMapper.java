package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.TelevisionDto;
import com.registerofequipment.petRegisterOfEquipment.models.Television;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import org.springframework.stereotype.Component;

@Component
public class TelevisionMapper {

    public Television convertDtoToTelevision(TelevisionDto televisionDto){
        Television television = new Television();
        if (televisionDto != null){
            television.setId(television.getId());
            television.setCategory(televisionDto.getCategory());
            television.setTechnology(televisionDto.getTechnology());
        }
        return television;
    }

    public TelevisionDto convertTelevisionToDto(Television television){
        TelevisionDto televisionDto = new TelevisionDto();
        if (television != null){
            televisionDto.setId(television.getId());
            televisionDto.setCategory(television.getCategory());
            televisionDto.setTechnology(television.getTechnology());
        }
        return televisionDto;
    }

    public Television compareHooverAndDto(TelevisionDto televisionDto, Television television) {
        if (television != null && televisionDto != null) {
            television = compareCategoryAndDto(televisionDto, television);
            television = compareTechnologyAndDto(televisionDto, television);
        }
        return television;
    }
    private Television compareCategoryAndDto(TelevisionDto televisionDto, Television television){
        if (!televisionDto.getCategory().equals(television.getCategory())) {
            television.setServiceFlag(ConstantsClass.ONE_FLAG);
            television.setCategory(televisionDto.getCategory());
        }
        return television;
    }

    private Television compareTechnologyAndDto(TelevisionDto televisionDto, Television television){
        if (!televisionDto.getTechnology().equals(television.getTechnology())) {
            television.setServiceFlag(ConstantsClass.ONE_FLAG);
            television.setTechnology(televisionDto.getTechnology());
        }
        return television;
    }

}
