package com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces;

import java.util.List;

public interface Verify<T, E>{

    T verifyThatAllFieldsEqual(List<T> listEquipment, E equipmentDto);

}
