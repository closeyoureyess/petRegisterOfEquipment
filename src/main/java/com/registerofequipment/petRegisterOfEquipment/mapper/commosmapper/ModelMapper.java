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
    private TypesEquipmentMapper typesEquipmentMapper;
    @Autowired
    private EquipmentMapper equipmentMapper;

    public Model convertDtoToModel(ModelDto modelDto) {
        Model model = new Model();
        if (modelDto != null) {
            model.setId(modelDto.getId());
            if (modelDto.getNameDevice() != null) {
                model.setNameDevice(modelDto.getNameDevice());
            }
            if (modelDto.getTypesEquipmentDto() != null) {
                model.setTypesEquipment(typesEquipmentMapper.convertDtoToTypesEquipment(modelDto.getTypesEquipmentDto()));
            }
            if (modelDto.getEquipmentDto() != null) {
                model.setEquipmentField(equipmentMapper.convertDtoToEquipment(modelDto.getEquipmentDto()));
            }
            if (modelDto.getSerialNumber() != null) {
                model.setSerialNumber(modelDto.getSerialNumber());
            }
            if (modelDto.getColor() != null) {
                model.setColor(modelDto.getColor());
            }
            if (modelDto.getSize() != null) {
                model.setSize(modelDto.getSize());
            }
            if (modelDto.getPrice() != null) {
                model.setPrice(modelDto.getPrice());
            }
            if (modelDto.getIsAvailability() != null) {
                model.setIsAvailability(modelDto.getIsAvailability());
            }
        }
        return model;
    }

    public ModelDto convertModelToDto(Model model) {
        ModelDto modelDto = new ModelDto();
        if (model != null) {
            modelDto.setId(model.getId());
            if (model.getNameDevice() != null) {
                modelDto.setNameDevice(model.getNameDevice());
            }
            if (model.getTypesEquipment() != null) {
                modelDto.setTypesEquipmentDto(typesEquipmentMapper.convertTypesEquipmentToDto(model.getTypesEquipment()));
            }
            if (model.getEquipmentField() != null) {
                modelDto.setEquipmentDto(equipmentMapper.convertEquipmentToDto(model.getEquipmentField()));
            }
            if (model.getSerialNumber() != null) {
                modelDto.setSerialNumber(model.getSerialNumber());
            }
            if (model.getColor() != null) {
                modelDto.setColor(model.getColor());
            }
            if (model.getSize() != null) {
                modelDto.setSize(model.getSize());
            }
            if (model.getPrice() != null) {
                modelDto.setPrice(model.getPrice());
            }
            if (model.getIsAvailability() != null) {
                modelDto.setIsAvailability(model.getIsAvailability());
            }
        }
        return modelDto;
    }

    public List<Model> transferModelDtoListToModel(List<ModelDto> modelDtoList) {
        List<Model> modelList = new LinkedList<>();
        if (modelDtoList != null) {
            for (int i = 0; i < modelDtoList.size(); i++) {
                modelList.add(new Model(modelDtoList.get(i).getId(),
                        modelDtoList.get(i).getNameDevice(),
                        typesEquipmentMapper.convertDtoToTypesEquipment(modelDtoList.get(i).getTypesEquipmentDto()),
                        equipmentMapper.convertDtoToEquipment(modelDtoList.get(i).getEquipmentDto()),
                        modelDtoList.get(i).getSerialNumber(),
                        modelDtoList.get(i).getColor(),
                        modelDtoList.get(i).getSize(),
                        modelDtoList.get(i).getPrice(),
                        modelDtoList.get(i).getIsAvailability())
                );
            }
        }
        return modelList;
    }

    public List<ModelDto> transferModelToModelDtoList(List<Model> modelList) {
        List<ModelDto> modelDtoList = new LinkedList<>();
        if (modelList != null) {
            for (int i = 0; i < modelList.size(); i++) {
                modelDtoList.add(new ModelDto(modelList.get(i).getId(),
                        modelList.get(i).getNameDevice(),
                        typesEquipmentMapper.convertTypesEquipmentToDto(modelList.get(i).getTypesEquipment()),
                        equipmentMapper.convertEquipmentToDto(modelList.get(i).getEquipmentField()),
                        modelList.get(i).getSerialNumber(),
                        modelList.get(i).getColor(),
                        modelList.get(i).getSize(),
                        modelList.get(i).getPrice(),
                        modelList.get(i).getIsAvailability()
                ));
            }
        }
        return modelDtoList;
    }
}
