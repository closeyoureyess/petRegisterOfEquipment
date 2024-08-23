package com.registerofequipment.petRegisterOfEquipment.service;

public interface CRUDServices<R, T> {

    R createPosition(T incomingObject);
    R getPosition(T incomingObject);
    R changePosition(T incomingObjectForChange);
    R deletePosition(T deleteObject);
}
