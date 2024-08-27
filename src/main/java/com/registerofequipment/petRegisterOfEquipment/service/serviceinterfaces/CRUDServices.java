package com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces;

import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DifferentTypesEquipmentExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.FieldsEmptyExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.NameTypeTechnicExeption;

import java.util.List;
import java.util.Optional;

public interface CRUDServices<R, T> {

    R createPosition(T incomingObject) throws NameTypeTechnicExeption, DifferentTypesEquipmentExeption, FieldsEmptyExeption;
    Optional<List<R>> getPositionPageByPage(String incomingObject, String typeOfEquipment, ColorEquipment colorEquipment, Integer price, Integer offset, Integer limit);
    R changePosition(T incomingObjectForChange);
    boolean deletePosition(Integer deleteObject);
}
