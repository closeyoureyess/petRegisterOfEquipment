package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public ModelDto addModel(ModelDto modelDto){
        return modelDto;
    }

    public ModelDto addModelNotSeparately(ModelDto modelDto){
        return modelDto;
    }

}
