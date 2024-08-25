package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Model;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.EquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.ModelMapper;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService implements CRUDServices<ModelDto, ModelDto> {

    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ModelDto createPosition(ModelDto modelDto) {
        EquipmentDto equipmentDto = equipmentService.searchForExistingEquipment(modelDto.getEquipmentDto());
        modelDto.setEquipmentDto(equipmentDto);
        Model localModel = modelMapper.convertDtoToModel(modelDto);
        localModel = modelRepository.save(localModel);
        return modelMapper.convertModelToDto(localModel);
    }

    @Override
    public List<ModelDto> getPosition(String nameModelDto, Integer offset, Integer limit) {
        Pageable pageble = PageRequest.of(offset, limit);
        Page<Model> pageModel = modelRepository.findAllByNameDevice(nameModelDto, pageble);
        return modelMapper.transferModelToModelDtoList(pageModel.stream().toList());
    }

    @Override
    public ModelDto changePosition(ModelDto modelDto) {
        return null;
    }

    @Override
    public boolean deletePosition(Integer idModel) {
        if (idModel != null) {
            modelRepository.deleteById(Long.valueOf(idModel));
            return true;
        }
        return false;
    }

    public ModelDto addModelNotSeparately(ModelDto modelDto) {
        return modelDto;
    }

    /*public ModelDto presenceModel(ModelDto modelDto){
        if (modelDto.getNameDevice())
    }*/
}
