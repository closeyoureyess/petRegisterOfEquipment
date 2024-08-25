package com.registerofequipment.petRegisterOfEquipment.controller;


import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.service.EquipmentService;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping("/create/equipment")
    public ResponseEntity<EquipmentDto> addEquipment(@RequestBody EquipmentDto equipmentDto) {
        EquipmentDto localEquipment = equipmentService.createPosition(equipmentDto);
        if (localEquipment != null) {
            return ResponseEntity.ok(localEquipment);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/gen-info/{nameTypeTechnicOrColorOrPrice}")
    public ResponseEntity<EquipmentDto> getEquipment(@PathVariable("nameDevice") String nameTypeTechnicOrColorOrPrice,
                                                     @RequestParam(value = "offset", defaultValue = "0") @Min(0) Integer offset,
                                                     @RequestParam(value = "limit", defaultValue = "10") @Min(1) Integer limit) {
        /*equipmentService.verifyThatAllFieldsEqual(nameTypeTechnicOrColorOrPrice);*/
        return ResponseEntity.notFound().build();
    }
}
