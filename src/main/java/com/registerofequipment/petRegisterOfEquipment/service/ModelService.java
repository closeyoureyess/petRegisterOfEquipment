package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.common.Model;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.EquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.ModelMapper;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.TypesEquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DescriptionExeptions;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DifferentTypesEquipmentExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.FieldsEmptyExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.NameTypeTechnicExeption;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.EquipmentRepository;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ModelService implements CRUDServices<ModelDto, ModelDto> {

    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;
    @Autowired
    private ModelMapper modelMapper;
    private static final Logger logger = Logger.getLogger(ModelService.class.getName());

    @Override
    public ModelDto createPosition(ModelDto modelDto) throws NameTypeTechnicExeption, DifferentTypesEquipmentExeption, FieldsEmptyExeption {
        Optional<List<Equipment>> optionalEquipmentList = Optional.empty();
        Model localModelForSave = new Model();
        if (modelDto != null) {
            optionalEquipmentList = findAllEquipmentByNameTechnic(modelDto);
            validateThatTypeTypeOfEquipmentModelsEqualSelectEquipment(modelDto);
            if (optionalEquipmentList.isPresent() && !optionalEquipmentList.get().isEmpty()) {
                Equipment resultCheckEquipment = equipmentService.verifyThatAllFieldsEqual(optionalEquipmentList.get(), modelDto.getEquipmentDto());
                modelDto.setEquipmentDto(null);
                localModelForSave = modelMapper.convertDtoToModel(modelDto);
                localModelForSave.setEquipmentField(resultCheckEquipment);
            } else {
                localModelForSave = modelMapper.convertDtoToModel(modelDto);
            }
            localModelForSave = modelRepository.save(localModelForSave);
        }
        return modelMapper.convertModelToDto(localModelForSave);
    }


    @Override
    public Optional<List<ModelDto>> getPositionPageByPage(String nameModelDto, Integer offset, Integer limit) {
        Pageable pageble = PageRequest.of(offset, limit);
        Page<Model> pageModel = modelRepository.findAllByNameDevice(nameModelDto, pageble);
        return Optional.of(modelMapper.transferModelToModelDtoList(pageModel.stream().toList()));
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

    private Optional<List<Equipment>> findAllEquipmentByNameTechnic(ModelDto modelDto) throws NameTypeTechnicExeption {
        String nameTypeTechnic = equipmentMapper.pullNameTypeTechnicFromEquipmentDto(modelDto.getEquipmentDto());
        return equipmentService.getPositionWithoutPages(nameTypeTechnic);
    }

    private void validateThatTypeTypeOfEquipmentModelsEqualSelectEquipment(ModelDto modelDto) throws DifferentTypesEquipmentExeption, FieldsEmptyExeption {
        Optional<String> optionalTypeOfEquipmentIsSelectedInModel = typesEquipmentMapper.determineWhichTypeOfEquipmentIsSelected(modelDto, ConstantsClass.ONE_FLAG);
        Optional<String> optionalTypeOfEquipmentIsSelectedInEquipmentClass = typesEquipmentMapper.determineWhichTypeOfEquipmentIsSelected(modelDto, ConstantsClass.ZERO_FLAG);
        if (optionalTypeOfEquipmentIsSelectedInEquipmentClass.isPresent() && optionalTypeOfEquipmentIsSelectedInModel.isPresent()) {
            typesEquipmentMapper.ifTypeTypeOfEquipmentNotEqualSelectEquipment(optionalTypeOfEquipmentIsSelectedInModel.get(), optionalTypeOfEquipmentIsSelectedInEquipmentClass.get());
        } else {
            throw new FieldsEmptyExeption(DescriptionExeptions.GENERATION_ERROR.getDescription(), new FieldsEmptyExeption(DescriptionExeptions.FIELDS_NOT_NULL.getDescription()));
        }
    }
}
