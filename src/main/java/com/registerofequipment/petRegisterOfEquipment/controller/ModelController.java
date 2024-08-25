package com.registerofequipment.petRegisterOfEquipment.controller;


import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
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
    public ResponseEntity<ModelDto> addModel(@RequestBody ModelDto modelDto){
        ModelDto localModelDto = modelService.createPosition(modelDto);
        if (localModelDto != null){
            return ResponseEntity.ok(localModelDto);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/gen-info/{nameDevice}")
    public ResponseEntity<List<ModelDto>> getModel(@PathVariable("nameDevice") String executorEmail,
                                             @RequestParam(value = "offset", defaultValue = "0") @Min(0) Integer offset,
                                             @RequestParam(value = "limit", defaultValue = "10") @Min(1) Integer limit
    ){
        Optional<List<ModelDto>> optionalListModel = modelService.getPosition(executorEmail, offset, limit);
        if (optionalListModel.isPresent()){
            return ResponseEntity.ok(optionalListModel.get());
        }
        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteModel(@PathVariable("id") Integer idModel){
        Boolean resultDeleteModel = modelService.deletePosition(idModel);
        if (resultDeleteModel){
            return ResponseEntity.ok(resultDeleteModel);
        }
        return ResponseEntity.badRequest().build();
    }

}
