package com.registerofequipment.petRegisterOfEquipment.controller;


import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping("/create/equipment")
    public ResponseEntity<EquipmentDto> addPosition(@RequestBody EquipmentDto equipmentDto){
        EquipmentDto localEquipment = equipmentService.createPosition(equipmentDto);
        if (localEquipment != null){
            return ResponseEntity.ok(localEquipment);
        }
        return ResponseEntity.badRequest().build();
    }

}
