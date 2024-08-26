package com.registerofequipment.petRegisterOfEquipment.service;

import java.util.List;
import java.util.Optional;

public interface CRUDServices<R, T> {

    R createPosition(T incomingObject);
    Optional<List<R>> getPositionPageByPage(String incomingObject, Integer offset, Integer limit);
    R changePosition(T incomingObjectForChange);
    boolean deletePosition(Integer deleteObject);
}
