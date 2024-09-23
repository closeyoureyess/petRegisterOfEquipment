package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.TelevisionDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.TelevisionMapper;
import com.registerofequipment.petRegisterOfEquipment.models.Television;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelevisionServiceImpl implements TelevisionService {

    @Autowired
    private TelevisionRepository televisionRepository;
    @Autowired
    private TelevisionMapper televisionMapper;

    @Override
    public Television verifyThatAllFieldsEqual(List<Television> listEquipment, TelevisionDto televisionDto) {
        Television televisionForCycle;
        Television televisionCompare = new Television();
        for (int i = 0; i < listEquipment.size(); i++) {
            televisionForCycle = listEquipment.get(i);
            televisionForCycle.setServiceFlag(ConstantsClass.ZERO_FLAG);
            televisionCompare = televisionMapper.compareHooverAndDto(televisionDto, televisionForCycle);
            if (televisionCompare.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)) {
                break;
            }
        }
        return televisionCompare;
    }

    @Override
    public List<Television> getAllByFields(TelevisionDto televisionDto) {
        Optional<List<Television>> resultSearchHoover = Optional.empty();
        if (televisionDto.getCategory() != null) {
            resultSearchHoover = televisionRepository.findAllByCategory(televisionDto.getCategory());
        }
        if (televisionDto.getTechnology() != null && (resultSearchHoover.isPresent() && !resultSearchHoover.get().isEmpty())) {
            resultSearchHoover = televisionRepository.findAllByTechnology(televisionDto.getTechnology());
        }
        return resultSearchHoover.get();
    }

    @Override
    public TelevisionDto getEntityById(Integer id) {
        Optional<Television> optionalFridge = televisionRepository.findById(Long.valueOf(id));
        return televisionMapper.convertTelevisionToDto(optionalFridge.get());
    }
}
