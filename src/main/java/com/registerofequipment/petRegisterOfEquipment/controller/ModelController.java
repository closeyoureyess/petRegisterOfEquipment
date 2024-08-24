package com.registerofequipment.petRegisterOfEquipment.controller;


import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @PostMapping("/create/model")
    public ResponseEntity<ModelDto> addModel(@RequestBody ModelDto modelDto){
        ModelDto localModelDto = modelService.createPosition(modelDto);
        if (localModelDto != null){
            return ResponseEntity.ok(localModelDto);
        }
        return ResponseEntity.badRequest().build();
    }

}
