package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.common.Model;

import java.io.Serializable;
import java.util.List;

public class EquipmentDto implements Serializable {

    private Integer id;
    private String nameTypeTechnic; //TV
    private TypesEquipment typesEquipment;
    private String manufacturerCountry; // Russia
    private String manufacturerCompany; // IBS
    private boolean isOrderOnline; // true
    private boolean isPossibilityInstallments; // true
    private List<Model> modelsAvailability; //

}
