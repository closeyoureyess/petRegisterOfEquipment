package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.PersonalComputerDto;
import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;

import java.util.List;

public interface PersonalComputerService {

    PersonalComputer verifyThatAllFieldsEqual(List<PersonalComputer> listEquipment, PersonalComputerDto equipmentDto);
    List<PersonalComputer> getAllByFields(PersonalComputerDto personalComputerDto);
    PersonalComputerDto getEntityById(Integer id);

}
