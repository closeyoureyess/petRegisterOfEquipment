package com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper;

import com.registerofequipment.petRegisterOfEquipment.common.Model;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ModelMapper {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;

    public Model convertDtoToModel(ModelDto modelDto){
        Model model = new Model();
        if (modelDto != null) {
            model.setId(modelDto.getId());
            model.setNameDevice(modelDto.getNameDevice());
            model.setTypesEquipment(typesEquipmentMapper.convertDtoToTypesEquipment(modelDto.getTypesEquipmentDto()));
            model.setSerialNumber(modelDto.getSerialNumber());
            model.setColor(modelDto.getColor());
            model.setSize(modelDto.getSize());
            model.setPrice(modelDto.getPrice());
            model.setAvailability(modelDto.getIsAvailability());
        }
        return model;
    }

    public ModelDto convertModelToDto(Model model){
        ModelDto modelDto = new ModelDto();
        if (model != null){
            modelDto.setId(model.getId());
            modelDto.setNameDevice(model.getNameDevice());
            modelDto.setTypesEquipmentDto(typesEquipmentMapper.convertTypesEquipmentToDto(model.getTypesEquipment()));
            modelDto.setSerialNumber(model.getSerialNumber());
            modelDto.setColor(model.getColor());
            modelDto.setSize(model.getSize());
            modelDto.setPrice(model.getPrice());
            modelDto.setAvailability(model.getIsAvailability());
        }
        return modelDto;
    }

    public List<Model> transferModelDtoListToModel(List<ModelDto> modelDtoList){
        List<Model> modelList = new LinkedList<>();
        for (int i = 0; i < modelList.size(); i++) {
            modelList.add(new Model(modelDtoList.get(i).getId(), modelDtoList.get(i).getNameDevice(),
                    typesEquipmentMapper.convertDtoToTypesEquipment(modelDtoList.get(i).getTypesEquipmentDto()), modelDtoList.get(i).getSerialNumber(),
                    modelDtoList.get(i).getColor(), modelDtoList.get(i).getSize(), modelDtoList.get(i).getPrice(), modelDtoList.get(i).getIsAvailability(),
                    null));
        }
        return modelList;
    }

    public List<ModelDto> transferModelToModelDtoList(List<Model> modelList){
        List<ModelDto> modelDtoList = new LinkedList<>();
        for (int i = 0; i < modelList.size(); i++) {
            modelDtoList.add(new ModelDto(modelList.get(i).getId(), modelList.get(i).getNameDevice(),
                    typesEquipmentMapper.convertTypesEquipmentToDto(modelList.get(i).getTypesEquipment()), modelList.get(i).getSerialNumber(),
                    modelList.get(i).getColor(), modelList.get(i).getSize(), modelList.get(i).getPrice(), modelList.get(i).getIsAvailability(),
                    null));
        }
        return modelDtoList;
    }
}
