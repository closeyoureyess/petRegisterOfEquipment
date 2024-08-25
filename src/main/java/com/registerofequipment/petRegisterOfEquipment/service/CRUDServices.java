package com.registerofequipment.petRegisterOfEquipment.service;

import java.util.List;

public interface CRUDServices<R, T> {

    R createPosition(T incomingObject);
    List<R> getPosition(String incomingObject, Integer offset, Integer limit);
    R changePosition(T incomingObjectForChange);
    boolean deletePosition(Integer deleteObject);
}
