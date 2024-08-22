package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.common.Equipment;

import java.io.Serializable;
import java.util.List;

public class ModelDto implements Serializable {

    private Integer id;
    private String uniqueNameDevice;
    private TypesEquipment typesEquipment;
    private Integer serialNumber;
    private String color;
    private Integer size;
    private Integer price;
    private boolean isAvailability;
    private List<Equipment> equipmentList;

}
