package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.PersonalComputerDto;
import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import org.springframework.stereotype.Component;

@Component
public class PersonalComputerMapper {

    public PersonalComputer convertDtoToPersonalComputer(PersonalComputerDto personalComputerDto){
        PersonalComputer personalComputer = new PersonalComputer();
        if (personalComputerDto != null) {
            personalComputer.setId(personalComputerDto.getId());
            personalComputer.setCategory(personalComputerDto.getCategory());
            personalComputer.setTypeProcessor(personalComputerDto.getTypeProcessor());
        }
        return personalComputer;
    }

    public PersonalComputerDto convertPersonalComputerToDto(PersonalComputer personalComputer){
        PersonalComputerDto personalComputerDto = new PersonalComputerDto();
        if (personalComputer != null) {
            personalComputerDto.setId(personalComputer.getId());
            personalComputerDto.setCategory(personalComputer.getCategory());
            personalComputerDto.setTypeProcessor(personalComputer.getTypeProcessor());
        }
        return personalComputerDto;
    }
}
