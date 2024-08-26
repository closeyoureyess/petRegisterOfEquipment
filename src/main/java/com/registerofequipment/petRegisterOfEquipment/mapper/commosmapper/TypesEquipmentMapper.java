package com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.dtos.commondto.ModelDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.*;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DescriptionExeptions;
import com.registerofequipment.petRegisterOfEquipment.others.exeptions.DifferentTypesEquipmentExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TypesEquipmentMapper {

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

    public TypesEquipment convertDtoToTypesEquipment(TypesEquipmentDto typesEquipmentDto) {
        TypesEquipment typesEquipment = new TypesEquipment();
        if (typesEquipmentDto != null) {
            typesEquipment.setId(typesEquipmentDto.getId());
            if (typesEquipmentDto.getFridgeDto() != null) {
                typesEquipment.setFridge(fridgeMapper.convertDtoToFridge(typesEquipmentDto.getFridgeDto()));
            }
            if (typesEquipmentDto.getHooverDto() != null) {
                typesEquipment.setHoover(hooverMapper.convertDtoToHoover(typesEquipmentDto.getHooverDto()));
            }
            if (typesEquipmentDto.getPersonalComputerDto() != null) {
                typesEquipment.setPersonalComputer(personalComputerMapper.convertDtoToPersonalComputer(typesEquipmentDto.getPersonalComputerDto()));
            }
            if (typesEquipmentDto.getSmartphoneDto() != null) {
                typesEquipment.setSmartphone(smartphoneMapper.convertDtoToSmartphone(typesEquipmentDto.getSmartphoneDto()));
            }
            if (typesEquipmentDto.getTelevisionDto() != null) {
                typesEquipment.setTelevision(televisionMapper.convertDtoToTelevision(typesEquipmentDto.getTelevisionDto()));
            }
        }
        return typesEquipment;
    }

    public TypesEquipmentDto convertTypesEquipmentToDto(TypesEquipment typesEquipment) {
        TypesEquipmentDto typesEquipmentDto = new TypesEquipmentDto();
        if (typesEquipment != null) {
            typesEquipmentDto.setId(typesEquipment.getId());
            if (typesEquipment.getFridge() != null) {
                typesEquipmentDto.setFridgeDto(fridgeMapper.convertFridgeToDto(typesEquipment.getFridge()));
            }
            if (typesEquipment.getHoover() != null) {
                typesEquipmentDto.setHooverDto(hooverMapper.convertHooverToDto(typesEquipment.getHoover()));
            }
            if (typesEquipment.getPersonalComputer() != null) {
                typesEquipmentDto.setPersonalComputerDto(personalComputerMapper.convertPersonalComputerToDto(typesEquipment.getPersonalComputer()));
            }
            if (typesEquipment.getSmartphone() != null) {
                typesEquipmentDto.setSmartphoneDto(smartphoneMapper.convertSmartphoneToDto(typesEquipment.getSmartphone()));
            }
            if (typesEquipment.getTelevision() != null) {
                typesEquipmentDto.setTelevisionDto(televisionMapper.convertTelevisionToDto(typesEquipment.getTelevision()));
            }
        }
        return typesEquipmentDto;
    }

    public Optional<TypeEquipmentEnum> compareStringAndEnum(String valueString) {
        for (int i = 0; i < ConstantsClass.TYPE_EQUIPMENT_ENUM_LIST.size(); i++) {
            if (valueString.equalsIgnoreCase(ConstantsClass.TYPE_EQUIPMENT_ENUM_LIST
                    .get(i)
                    .getTypeEquipmentEnum())) {
                return Optional.of(ConstantsClass.TYPE_EQUIPMENT_ENUM_LIST.get(i));
            }
        }
        return Optional.empty();
    }

    public Optional<String> determineWhichTypeOfEquipmentIsSelected(ModelDto modelDto, Integer flag) {
        if (flag.equals(ConstantsClass.ONE_FLAG)) {
            Integer index = null;
            String types = null;
            if (modelDto.getTypesEquipmentDto().getFridgeDto() != null) {
                types = modelDto.getTypesEquipmentDto().getFridgeDto().getClass().getName();
                index = types.lastIndexOf(ConstantsClass.DOT);
            } else if (modelDto.getTypesEquipmentDto().getHooverDto() != null) {
                types = modelDto.getTypesEquipmentDto().getHooverDto().getClass().getName();
                index = types.lastIndexOf(ConstantsClass.DOT);
            } else if (modelDto.getTypesEquipmentDto().getPersonalComputerDto() != null) {
                types = modelDto.getTypesEquipmentDto().getPersonalComputerDto().getClass().getName();
                index = types.lastIndexOf(ConstantsClass.DOT);
            } else if (modelDto.getTypesEquipmentDto().getSmartphoneDto() != null) {
                types = modelDto.getTypesEquipmentDto().getSmartphoneDto().getClass().getName();
                index = types.lastIndexOf(ConstantsClass.DOT);
            } else if (modelDto.getTypesEquipmentDto().getTelevisionDto() != null) {
                types = modelDto.getTypesEquipmentDto().getTelevisionDto().getClass().getName();
                index = types.lastIndexOf(ConstantsClass.DOT);
            }
            String nameClassTypeEquipmentmodelDto = types.substring(index + ConstantsClass.ONE_FLAG);
            if (nameClassTypeEquipmentmodelDto.contains(ConstantsClass.NAME_TYPE_DTO)) {
                index = nameClassTypeEquipmentmodelDto.lastIndexOf(ConstantsClass.D_LETTER_ENG_ALPHABET);
                nameClassTypeEquipmentmodelDto = nameClassTypeEquipmentmodelDto.substring(ConstantsClass.ZERO_FLAG, index);
            }
            Optional<TypeEquipmentEnum> optionalString = compareStringAndEnum(nameClassTypeEquipmentmodelDto);
            if (optionalString.isPresent()){
                return Optional.of(String.valueOf(optionalString.get()));
            }
        } else if (flag.equals(ConstantsClass.ZERO_FLAG)) {
            return Optional.of(modelDto.getEquipmentDto().getNameTypeTechnic().getTypeEquipmentEnum());
        }
        return Optional.empty();
    }

    public void ifTypeTypeOfEquipmentNotEqualSelectEquipment(String nameTypeTechnicInModelClass, String nameTypeTechnicInEquipmentClass) throws DifferentTypesEquipmentExeption {
        if (!nameTypeTechnicInModelClass.equalsIgnoreCase(nameTypeTechnicInEquipmentClass)) {
            throw new DifferentTypesEquipmentExeption(DescriptionExeptions.GENERATION_ERROR.getDescription(), new DifferentTypesEquipmentExeption(DescriptionExeptions.DIFFERENT_TYPES_TECHNICS.getDescription()));
        }
    }


}
