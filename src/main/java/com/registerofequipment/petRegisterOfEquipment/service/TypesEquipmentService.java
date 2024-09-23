package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.MainException;

public interface TypesEquipmentService {

    TypesEquipmentDto createPosition(TypesEquipmentDto incomingObject) throws MainException;
    TypesEquipment getTypesWithFridgeEntity(Integer fridgeId);
    TypesEquipment getTypesWithHooverEntity(Integer hooverId);
    TypesEquipment getTypesWithPersonalComputerEntity(Integer personalComputerId);
    TypesEquipment getTypesWithSmartphoneEntity(Integer smartphoneId);
    TypesEquipment getTypesWithTelevisionEntity(Integer televisionId);
    TypesEquipmentDto changePosition(TypesEquipmentDto incomingObjectForChange);
    boolean deletePosition(Integer deleteObject);

}
