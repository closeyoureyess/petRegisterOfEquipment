package com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces;

import java.util.List;

public interface RESTGetAll<R, T>{

    List<R> getAllByFields(T dto);
}
