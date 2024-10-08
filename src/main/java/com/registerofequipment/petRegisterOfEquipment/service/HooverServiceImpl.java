package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.HooverDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.HooverMapper;
import com.registerofequipment.petRegisterOfEquipment.models.Hoover;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.HooverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HooverServiceImpl implements HooverService {
    @Autowired
    private HooverMapper hooverMapper;
    @Autowired
    private HooverRepository hooverRepository;

    @Override
    public Hoover verifyThatAllFieldsEqual(List<Hoover> listEquipment, HooverDto equipmentDto) {
        Hoover hooverForCycle;
        Hoover hooverAfterCompare = new Hoover();
        for (int i = 0; i < listEquipment.size(); i++) {
            hooverForCycle = listEquipment.get(i);
            hooverForCycle.setServiceFlag(ConstantsClass.ZERO_FLAG);
            hooverAfterCompare = hooverMapper.compareHooverAndDto(equipmentDto, hooverForCycle);
            if (hooverAfterCompare.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)) {
                break;
            }
        }
        return hooverAfterCompare;
    }

    @Override
    public List<Hoover> getAllByFields(HooverDto hooverDto) {
        Optional<List<Hoover>> resultSearchHoover = Optional.empty();
        if (hooverDto.getCountsRegime() != null) {
            resultSearchHoover = hooverRepository.findAllByCountsRegime(hooverDto.getCountsRegime());
        }
        if (hooverDto.getSizeDustCollect() != null && (resultSearchHoover.isPresent() && !resultSearchHoover.get().isEmpty())){
            resultSearchHoover = hooverRepository.findAllBySizeDustCollect(hooverDto.getSizeDustCollect());
        }
        return resultSearchHoover.get();
    }

    @Override
    public HooverDto getEntityById(Integer id) {
        Optional<Hoover> optionalFridge = hooverRepository.findById(Long.valueOf(id));
        return hooverMapper.convertHooverToDto(optionalFridge.get());
    }
}
