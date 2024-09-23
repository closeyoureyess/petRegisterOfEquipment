package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.MainException;

import java.util.List;
import java.util.Optional;

public interface EquipmentService {

    EquipmentDto createPosition(EquipmentDto equipmentDto) throws MainException;
    Optional<List<EquipmentDto>> getPositionPageByPage(String incomingObject, String typeOfEquipment, ColorEquipment colorEquipment,
                                                       Integer price, Integer offset, Integer limit);
    Optional<List<EquipmentDto>> getPositionPageByPageSpecial(String nameTypeTechnicString, Integer offset, Integer limit);
    Optional<List<Equipment>> getPositionWithoutPages(String nameTypeTechnicString);
    boolean deletePosition(Integer equipmentDto);
    Equipment verifyThatAllFieldsEqual(List<Equipment> listEquipment, EquipmentDto equipmentDto);

}
