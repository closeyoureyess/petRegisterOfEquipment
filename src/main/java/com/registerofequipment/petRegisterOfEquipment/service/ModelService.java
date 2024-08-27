package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.common.Model;
import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.EquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.ModelMapper;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.TypesEquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.*;
import com.registerofequipment.petRegisterOfEquipment.models.*;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DescriptionExeptions;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DifferentTypesEquipmentExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.FieldsEmptyExeption;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.NameTypeTechnicExeption;
import com.registerofequipment.petRegisterOfEquipment.repository.TypesEquipmentRepository;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.EquipmentRepository;
import com.registerofequipment.petRegisterOfEquipment.repository.commonrep.ModelRepository;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.FridgeRepository;
import com.registerofequipment.petRegisterOfEquipment.service.serviceinterfaces.CRUDServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
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
    private FridgeService fridgeService;
    @Autowired
    private HooverService hooverService;
    @Autowired
    private PersonalComputerService personalComputerService;
    @Autowired
    private SmartphoneService smartphoneService;
    @Autowired
    private TelevisionService televisionService;
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private FridgeMapper fridgeMapper;
    @Autowired
    private HooverMapper hooverMapper;
    @Autowired
    private PersonalComputerMapper personalComputerMapper;
    @Autowired
    private SmartphoneMapper smartphoneMapper;
    @Autowired
    private TelevisionMapper televisionMapper;
    @Autowired
    private TypesEquipmentService typesEquipmentService;
    @Autowired
    private TypesEquipmentRepository typesEquipmentRepository;
    @Autowired
    private FridgeRepository fridgeRepository;
    private static final Logger logger = Logger.getLogger(ModelService.class.getName());

    @Override
    public ModelDto createPosition(ModelDto modelDto) throws NameTypeTechnicExeption, DifferentTypesEquipmentExeption, FieldsEmptyExeption {
        Optional<List<Equipment>> optionalEquipmentList;
        Model localModelForSave = new Model();
        if (modelDto != null) {
            optionalEquipmentList = findAllEquipmentByNameTechnic(modelDto);
            validateThatTypeTypeOfEquipmentModelsEqualSelectEquipment(modelDto);
            if (optionalEquipmentList.isPresent() && !optionalEquipmentList.get().isEmpty()) {
                Equipment resultCheckEquipment = equipmentService.verifyThatAllFieldsEqual(optionalEquipmentList.get(), modelDto.getEquipmentDto());
                if (resultCheckEquipment.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)) {
                    modelDto.setEquipmentDto(null);
                    localModelForSave = modelMapper.convertDtoToModel(modelDto);
                    localModelForSave.setEquipmentField(resultCheckEquipment);
                }
            } else {
                localModelForSave = modelMapper.convertDtoToModel(modelDto);
            }
            localModelForSave = modelRepository.save(localModelForSave);
        }
        return modelMapper.convertModelToDto(localModelForSave);
    }

    @Override
    public Optional<List<ModelDto>> getPositionPageByPage(String nameModelDto, String typeOfEquipment, ColorEquipment colorEquipment, Integer price,
                                                          Integer offset, Integer limit) {
        Pageable pageble = PageRequest.of(offset, limit);
        Page<Model> pageModel = modelRepository.findAllByNameDevice(nameModelDto, pageble);
        List<Model> modelList = pageModel.stream().toList();
        filterCollection(typeOfEquipment, colorEquipment,price,
                offset,limit)
        return Optional.of(modelMapper.transferModelToModelDtoList(modelList));
    }

    private ModelDto filterModelByCriteries(List<Model> modelList, ColorEquipment colorEquipment) {
        Optional<ColorEquipment> optional = typesEquipmentMapper.compareStringAndEnumColor(colorEquipment.getColorName(), ConstantsClass.COLOR_EQUIPMENTS);
        if (optional.isPresent()) {

        }
    }

    private String filterCollection(List<Model> modelList, String typeOfEquipment, ColorEquipment colorEquipment, Integer price) {
        List<Model> filterList = new LinkedList<>();
        for (int i = 0; i < modelList.size(); i++) {

            if (typeOfEquipment == null && colorEquipment == null && price == null) {
                filterList.add(modelList.get(i));
            } else if (typeOfEquipment != null && colorEquipment == null && price == null) {

            } else if (typeOfEquipment == null && colorEquipment != null && price == null) {

            } else if (typeOfEquipment == null && colorEquipment == null && price != null) {

            } else if (typeOfEquipment != null && colorEquipment != null && price == null) {

            } else if (typeOfEquipment != null && colorEquipment == null && price != null) {

            } else if (typeOfEquipment == null && colorEquipment != null && price != null) {

            } else if (typeOfEquipment != null && colorEquipment != null && price != null) {

            }
        }
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

    //Закомментированный код из метода create

    /*if (modelDto.getTypesEquipmentDto().getFridgeDto() != null) {
        List<Fridge> listWithFridgeFromDB = fridgeService.getAllByFields(modelDto.getTypesEquipmentDto().getFridgeDto());
        if (!listWithFridgeFromDB.isEmpty()) {
            Fridge resultFridgeAfterEqual = fridgeService.verifyThatAllFieldsEqual(listWithFridgeFromDB, modelDto
                    .getTypesEquipmentDto()
                    .getFridgeDto());
            if (resultFridgeAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                modelDto.getTypesEquipmentDto().setFridgeDto(null);
                localModelForSave.setTypesEquipment(typesEquipmentService.getTypesWithFridgeEntity(resultFridgeAfterEqual.getId()));
                logger.info("RESULT THIS THIS" + localModelForSave.getTypesEquipment().getFridge().getId());
            }
        }
    }
            if (modelDto.getTypesEquipmentDto().getHooverDto() != null) {
        List<Hoover> listWithFHooverFromDB = hooverService.getAllByFields(modelDto.getTypesEquipmentDto().getHooverDto());
        if (!listWithFHooverFromDB.isEmpty()) {
            Hoover resultHooverAfterEqual = hooverService.verifyThatAllFieldsEqual(listWithFHooverFromDB, modelDto
                    .getTypesEquipmentDto()
                    .getHooverDto());
            if (resultHooverAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                modelDto.getTypesEquipmentDto().setFridgeDto(null);
                localModelForSave.setTypesEquipment(new TypesEquipment(resultHooverAfterEqual));
            }
        }
    }
            if (modelDto.getTypesEquipmentDto().getPersonalComputerDto() != null) {
        List<PersonalComputer> listWithFPersonalComputerFromDB = personalComputerService.getAllByFields(modelDto.getTypesEquipmentDto().getPersonalComputerDto());
        if (!listWithFPersonalComputerFromDB.isEmpty()) {
            PersonalComputer resultPersonalComputerAfterEqual = personalComputerService.verifyThatAllFieldsEqual(listWithFPersonalComputerFromDB, modelDto
                    .getTypesEquipmentDto()
                    .getPersonalComputerDto());
            if (resultPersonalComputerAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                modelDto.getTypesEquipmentDto().setFridgeDto(null);
            }
        }
    }
            if (modelDto.getTypesEquipmentDto().getSmartphoneDto() != null) {
        List<Smartphone> listWithFSmartphoneComputerFromDB = smartphoneService.getAllByFields(modelDto.getTypesEquipmentDto().getSmartphoneDto());
        if (!listWithFSmartphoneComputerFromDB.isEmpty()) {
            Smartphone resultSmartphoneComputerAfterEqual = smartphoneService.verifyThatAllFieldsEqual(listWithFSmartphoneComputerFromDB, modelDto
                    .getTypesEquipmentDto()
                    .getSmartphoneDto());
            if (resultSmartphoneComputerAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                modelDto.getTypesEquipmentDto().setFridgeDto(null);
            }
        }
    }
            if (modelDto.getTypesEquipmentDto().getTelevisionDto() != null){
        List<Television> listWithFTelevisionComputerFromDB = televisionService.getAllByFields(modelDto.getTypesEquipmentDto().getTelevisionDto());
        if (!listWithFTelevisionComputerFromDB.isEmpty()) {
            Television resultTelevisionComputerAfterEqual = televisionService.verifyThatAllFieldsEqual(listWithFTelevisionComputerFromDB, modelDto
                    .getTypesEquipmentDto()
                    .getTelevisionDto());
            if (resultTelevisionComputerAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                modelDto.getTypesEquipmentDto().setFridgeDto(null);
            }
        }
    }*/

    /*private ModelDto validateFridgeHooverAndEtcAlreadyExist(ModelDto modelDto){
        if (modelDto.getTypesEquipmentDto().getFridgeDto() != null) {
            modelDto = verifyFridgeAlreadyExist(modelDto);
        }
        if (modelDto.getTypesEquipmentDto().getHooverDto() != null) {
            modelDto = verifyHooverAlreadyExist(modelDto);
        }
        if (modelDto.getTypesEquipmentDto().getPersonalComputerDto() != null) {
            modelDto = verifyPersonalComputerAlreadyExist(modelDto);
        }
        if (modelDto.getTypesEquipmentDto().getSmartphoneDto() != null) {
            modelDto = verifySmartphoneAlreadyExist(modelDto);
        }
        if (modelDto.getTypesEquipmentDto().getTelevisionDto() != null) {
            modelDto = verifyTelevisionAlreadyExist(modelDto);
        }
        return modelDto;
    }

    private ModelDto verifyFridgeAlreadyExist(ModelDto modelDto){
        if (modelDto.getTypesEquipmentDto().getFridgeDto() != null) {
            List<Fridge> listWithFridgeFromDB = fridgeService.getAllByFields(modelDto.getTypesEquipmentDto().getFridgeDto());
            if (!listWithFridgeFromDB.isEmpty()) {
                Fridge resultFridgeAfterEqual = fridgeService.verifyThatAllFieldsEqual(listWithFridgeFromDB, modelDto
                        .getTypesEquipmentDto()
                        .getFridgeDto());
                if (resultFridgeAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                    modelDto.getTypesEquipmentDto().setFridgeDto(fridgeMapper.convertFridgeToDto(resultFridgeAfterEqual));
                }
            }
        }
        return modelDto;
    }
    private ModelDto verifyHooverAlreadyExist(ModelDto modelDto){
        if (modelDto.getTypesEquipmentDto().getHooverDto() != null) {
            List<Hoover> listWithFHooverFromDB = hooverService.getAllByFields(modelDto.getTypesEquipmentDto().getHooverDto());
            if (!listWithFHooverFromDB.isEmpty()) {
                Hoover resultHooverAfterEqual = hooverService.verifyThatAllFieldsEqual(listWithFHooverFromDB, modelDto
                        .getTypesEquipmentDto()
                        .getHooverDto());
                if (resultHooverAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                    modelDto.getTypesEquipmentDto().setFridgeDto(null);
                }
            }
        }
        return modelDto;
    }

    private ModelDto verifyPersonalComputerAlreadyExist(ModelDto modelDto){
        if (modelDto.getTypesEquipmentDto().getPersonalComputerDto() != null) {
            List<PersonalComputer> listWithFPersonalComputerFromDB = personalComputerService.getAllByFields(modelDto.getTypesEquipmentDto().getPersonalComputerDto());
            if (!listWithFPersonalComputerFromDB.isEmpty()) {
                PersonalComputer resultPersonalComputerAfterEqual = personalComputerService.verifyThatAllFieldsEqual(listWithFPersonalComputerFromDB, modelDto
                        .getTypesEquipmentDto()
                        .getPersonalComputerDto());
                if (resultPersonalComputerAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                    modelDto.getTypesEquipmentDto().setFridgeDto(null);
                }
            }
        }
        return modelDto;
    }

    private ModelDto verifySmartphoneAlreadyExist(ModelDto modelDto){
        if (modelDto.getTypesEquipmentDto().getSmartphoneDto() != null) {
            List<Smartphone> listWithFSmartphoneComputerFromDB = smartphoneService.getAllByFields(modelDto.getTypesEquipmentDto().getSmartphoneDto());
            if (!listWithFSmartphoneComputerFromDB.isEmpty()) {
                Smartphone resultSmartphoneComputerAfterEqual = smartphoneService.verifyThatAllFieldsEqual(listWithFSmartphoneComputerFromDB, modelDto
                        .getTypesEquipmentDto()
                        .getSmartphoneDto());
                if (resultSmartphoneComputerAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                    modelDto.getTypesEquipmentDto().setFridgeDto(null);
                }
            }
        }
        return modelDto;
    }

    private ModelDto verifyTelevisionAlreadyExist(ModelDto modelDto){
        if (modelDto.getTypesEquipmentDto().getTelevisionDto() != null){
            List<Television> listWithFTelevisionComputerFromDB = televisionService.getAllByFields(modelDto.getTypesEquipmentDto().getTelevisionDto());
            if (!listWithFTelevisionComputerFromDB.isEmpty()) {
                Television resultTelevisionComputerAfterEqual = televisionService.verifyThatAllFieldsEqual(listWithFTelevisionComputerFromDB, modelDto
                        .getTypesEquipmentDto()
                        .getTelevisionDto());
                if (resultTelevisionComputerAfterEqual.getServiceFlag().equals(ConstantsClass.ZERO_FLAG)){
                    modelDto.getTypesEquipmentDto().setFridgeDto(null);
                }
            }
        }
        return modelDto;
    }
*/

}
