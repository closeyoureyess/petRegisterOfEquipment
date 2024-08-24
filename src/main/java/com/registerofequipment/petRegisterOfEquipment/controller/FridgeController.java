package com.registerofequipment.petRegisterOfEquipment.controller;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.service.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class FridgeController {

    @Autowired
    private FridgeService fridgeService;

    @PostMapping("/create/fridge")
    public ResponseEntity<FridgeDto> createFridge(@RequestBody FridgeDto fridgeDto) {
        FridgeDto localFridge = fridgeService.createPosition(fridgeDto);
        if (localFridge != null) {
            return ResponseEntity.ok(localFridge);
        }
        return ResponseEntity.badRequest().build();
    }

}
