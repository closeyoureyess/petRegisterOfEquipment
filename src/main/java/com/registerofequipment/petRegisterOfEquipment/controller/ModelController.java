package com.registerofequipment.petRegisterOfEquipment.controller;


import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DifferentTypesEquipmentExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.FieldsEmptyExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.NameTypeTechnicExeption;
import com.registerofequipment.petRegisterOfEquipment.service.ModelService;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @PostMapping("/create")
    public ResponseEntity<ModelDto> addModel(@RequestBody ModelDto modelDto) throws NameTypeTechnicExeption, DifferentTypesEquipmentExeption, FieldsEmptyExeption {
        ModelDto localModelDto = modelService.createPosition(modelDto);
        if (localModelDto != null) {
            return ResponseEntity.ok(localModelDto);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/gen-info/{nameDevice}")
    public ResponseEntity<List<ModelDto>> getModel(@PathVariable("nameDevice") String nameDevice,
                                                   @RequestParam(value = "typeOfEquipment") String typeOfEquipment,
                                                   @RequestParam(value = "color") ColorEquipment colorEquipment,
                                                   @RequestParam(value = "price") Integer price,
                                                   @RequestParam(value = "offset", defaultValue = "0") @Min(0) Integer offset,
                                                   @RequestParam(value = "limit", defaultValue = "10") @Min(1) Integer limit
    ) {
        Optional<List<ModelDto>> optionalListModel = modelService.getPositionPageByPage(nameDevice, typeOfEquipment, colorEquipment, price, offset, limit);
        if (optionalListModel.isPresent()) {
            return ResponseEntity.ok(optionalListModel.get());
        }
        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteModel(@PathVariable("id") Integer idModel) {
        Boolean resultDeleteModel = modelService.deletePosition(idModel);
        if (resultDeleteModel) {
            return ResponseEntity.ok(resultDeleteModel);
        }
        return ResponseEntity.badRequest().build();
    }

}
