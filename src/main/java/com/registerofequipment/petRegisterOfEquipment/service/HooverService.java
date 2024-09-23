package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.HooverDto;
import com.registerofequipment.petRegisterOfEquipment.models.Hoover;

import java.util.List;

public interface HooverService {

    Hoover verifyThatAllFieldsEqual(List<Hoover> listEquipment, HooverDto equipmentDto);
    List<Hoover> getAllByFields(HooverDto hooverDto);
    HooverDto getEntityById(Integer id);

}
