package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.PersonalComputerDto;
import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;

import java.util.List;

public class PersonalComputerService implements Verify<PersonalComputer, PersonalComputerDto> {
    @Override
    public PersonalComputer verifyThatAllFieldsEqual(List<PersonalComputer> listEquipment, PersonalComputerDto equipmentDto) {
        return null;
    }
}
