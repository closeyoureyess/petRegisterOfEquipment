package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.MainException;

import java.util.List;
import java.util.Optional;

public interface ModelService {

    ModelDto createPosition(ModelDto modelDto) throws MainException;
    Optional<List<ModelDto>> getPositionPageByPage(String nameModelDto, String typeOfEquipment, ColorEquipment colorEquipment, Integer price,
                                                   Integer offset, Integer limit);
    List<ModelDto> getFilteredModels(
            String nameDevice,
            String typeOfEquipment,
            ColorEquipment colorEquipment,
            Integer price,
            Integer size,
            Boolean isAvailability,
            Integer offset,
            Integer limit,
            String sortBy,  // Параметр для сортировки
            String sortOrder // Параметр для порядка сортировки (asc/desc)
    );
    ModelDto changePosition(ModelDto modelDto);
    boolean deletePosition(Integer idModel);

}
