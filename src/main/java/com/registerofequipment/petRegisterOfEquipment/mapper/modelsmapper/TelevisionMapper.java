package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.TelevisionDto;
import com.registerofequipment.petRegisterOfEquipment.models.Television;
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

}
