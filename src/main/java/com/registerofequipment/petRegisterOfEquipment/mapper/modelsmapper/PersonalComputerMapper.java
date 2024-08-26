package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.PersonalComputerDto;
import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
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

    public PersonalComputer comparePersonalComputerAndDto(PersonalComputerDto personalComputerDto, PersonalComputer personalComputer) {
        if (personalComputer != null && personalComputerDto != null) {
            personalComputer = compareTypeProcessorAndDto(personalComputerDto, personalComputer);
            personalComputer = compareCategoryAndDto(personalComputerDto, personalComputer);
        }
        return personalComputer;
    }
    private PersonalComputer compareTypeProcessorAndDto(PersonalComputerDto personalComputerDto, PersonalComputer personalComputer){
        if (!personalComputerDto.getTypeProcessor().equals(personalComputer.getTypeProcessor())) {
            personalComputer.setServiceFlag(ConstantsClass.ONE_FLAG);
            personalComputer.setTypeProcessor(personalComputerDto.getTypeProcessor());
        }
        return personalComputer;
    }

    private PersonalComputer compareCategoryAndDto(PersonalComputerDto personalComputerDto, PersonalComputer personalComputer){
        if (!personalComputerDto.getCategory().equals(personalComputer.getCategory())) {
            personalComputer.setServiceFlag(ConstantsClass.ONE_FLAG);
            personalComputer.setCategory(personalComputerDto.getCategory());
        }
        return personalComputer;
    }
}
