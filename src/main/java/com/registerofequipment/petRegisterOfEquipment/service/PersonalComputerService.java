package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.PersonalComputerDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.PersonalComputerMapper;
import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.PersonalComputerRepository;
import com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces.RESTGetAll;
import com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces.RESTGetId;
import com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces.Verify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalComputerService implements Verify<PersonalComputer, PersonalComputerDto>, RESTGetAll<PersonalComputer, PersonalComputerDto>, RESTGetId<PersonalComputerDto, Integer> {

    @Autowired
    private PersonalComputerRepository personalComputerRepository;
    @Autowired
    private PersonalComputerMapper personalComputerMapper;

    @Override
    public PersonalComputer verifyThatAllFieldsEqual(List<PersonalComputer> listEquipment, PersonalComputerDto equipmentDto) {
        return null;
    }

    @Override
    public List<PersonalComputer> getAllByFields(PersonalComputerDto personalComputerDto) {
        Optional<List<PersonalComputer>> resultSearchPersonalComputer = Optional.empty();
        if (personalComputerDto.getTypeProcessor() != null) {
            resultSearchPersonalComputer = personalComputerRepository.findAllByTypeProcessor(personalComputerDto.getTypeProcessor());
        }
        if (personalComputerDto.getCategory() != null && (resultSearchPersonalComputer.isPresent() && !resultSearchPersonalComputer.get()
                .isEmpty())){
            resultSearchPersonalComputer = personalComputerRepository.findAllByCategory(personalComputerDto.getCategory());
        }
        return resultSearchPersonalComputer.get();
    }

    @Override
    public PersonalComputerDto getEntityById(Integer id) {
        Optional<PersonalComputer> optionalPersonalComputer = personalComputerRepository.findById(Long.valueOf(id));
        return personalComputerMapper.convertPersonalComputerToDto(optionalPersonalComputer.get());
    }
}
