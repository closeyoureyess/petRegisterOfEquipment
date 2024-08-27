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
    public ResponseEntity<List<ModelDto>> getModel(@RequestParam(value = "nameDevice", required = false) String nameDevice,
                                                   @RequestParam(value = "typeOfEquipment", required = false) String typeOfEquipment,
                                                   @RequestParam(value = "color", required = false) ColorEquipment colorEquipment,
                                                   @RequestParam(value = "price", required = false) Integer price,
                                                   @RequestParam(value = "size", required = false) Integer size,
                                                   @RequestParam(value = "isAvailability", required = false) Boolean isAvailability,
                                                   @RequestParam(value = "offset", defaultValue = "0") @Min(0) Integer offset,
                                                   @RequestParam(value = "limit", defaultValue = "10") @Min(1) Integer limit,
                                                   @RequestParam(value = "sortBy", defaultValue = "name") String sortBy,
                                                   @RequestParam(value = "sortOrder", defaultValue = "asc") String sortOrder
    ) {
        List<ModelDto> listModel = modelService.getFilteredModels(nameDevice, typeOfEquipment, colorEquipment, price, size, isAvailability, offset, limit, sortBy, sortOrder);
        if (listModel != null) {
            return ResponseEntity.ok(listModel);
        }
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/change")
    public ResponseEntity<ModelDto> updateModel(@RequestBody ModelDto modelDto) {
            // Обновляем модель с помощью сервиса
            ModelDto updatedModelDto = modelService.changePosition(modelDto);
            if (updatedModelDto != null) {
                return ResponseEntity.ok(updatedModelDto);
            }
                return ResponseEntity.notFound().build(); // Модель не найдена
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
