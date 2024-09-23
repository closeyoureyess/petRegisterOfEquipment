package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.SmartphoneDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.SmartphoneMapper;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;
    @Autowired
    private SmartphoneMapper smartphoneMapper;

    @Override
    public Smartphone verifyThatAllFieldsEqual(List<Smartphone> listEquipment, SmartphoneDto equipmentDto) {
        Smartphone smartphoneForCycle;
        Smartphone smartphoneCompare = new Smartphone();
        for (int i = 0; i < listEquipment.size(); i++) {
            smartphoneForCycle = listEquipment.get(i);
            smartphoneForCycle.setServiceFlag(ConstantsClass.ZERO_FLAG);
            smartphoneCompare = smartphoneMapper.compareHooverAndDto(equipmentDto, smartphoneForCycle);
            if (smartphoneCompare.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)) {
                break;
            }
        }
        return smartphoneCompare;
    }

    @Override
    public List<Smartphone> getAllByFields(SmartphoneDto smartphoneDto) {
        Optional<List<Smartphone>> resultSearchHoover = Optional.empty();
        if (smartphoneDto.getMemoryPhone() != null) {
            resultSearchHoover = smartphoneRepository.findAllByMemoryPhone(smartphoneDto.getMemoryPhone());
        }
        if (smartphoneDto.getCountsSnaps() != null && (resultSearchHoover.isPresent() && !resultSearchHoover.get().isEmpty())){
            resultSearchHoover = smartphoneRepository.findAllByCountsSnaps(smartphoneDto.getCountsSnaps());
        }
        return resultSearchHoover.get();
    }

    @Override
    public SmartphoneDto getEntityById(Integer id) {
        Optional<Smartphone> optionalFridge = smartphoneRepository.findById(Long.valueOf(id));
        return smartphoneMapper.convertSmartphoneToDto(optionalFridge.get());
    }
}
