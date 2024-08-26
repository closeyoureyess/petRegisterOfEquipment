package com.registerofequipment.petRegisterOfEquipment.service;

import java.util.List;

public interface Verify<T, E>{

    T verifyThatAllFieldsEqual(List<T> listEquipment, E equipmentDto);

}
