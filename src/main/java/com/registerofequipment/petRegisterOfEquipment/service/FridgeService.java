package com.registerofequipment.petRegisterOfEquipment.service;

import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.mapper.commosmapper.TypesEquipmentMapper;
import com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper.FridgeMapper;
import com.registerofequipment.petRegisterOfEquipment.repository.TypesEquipmentRepository;
import com.registerofequipment.petRegisterOfEquipment.repository.modelsrep.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FridgeService implements CRUDServices<FridgeDto, FridgeDto> {

    @Autowired
    private TypesEquipmentRepository typesEquipmentRepository;
    @Autowired
    private TypesEquipmentMapper typesEquipmentMapper;
    @Autowired
    private TypesEquipmentService typesEquipmentService;
    @Autowired
    private FridgeRepository fridgeRepository;
    @Autowired
    private FridgeMapper fridgeMapper;


    @Override
    public FridgeDto createPosition(FridgeDto incomingObject) {
        TypesEquipmentDto typesEquipmentDto = new TypesEquipmentDto();
        typesEquipmentDto.setFridgeDto(incomingObject);
        return typesEquipmentService.createPosition(typesEquipmentDto).getFridgeDto();
        /*TypesEquipment localTypesEquipment = new TypesEquipment();*/
        /*localTypesEquipment.setFridge(fridgeMapper.convertDtoToFridge(incomingObject));
        localTypesEquipment = typesEquipmentRepository.save(localTypesEquipment);*/

        /*TypesEquipmentDto typesEquipmentDto = typesEquipmentService.createPosition(localTypesEquipmentDto);*/
        /*typesEquipmentDto.getFridgeDto()*/
        /*localTypesEquipment = typesEquipmentRepository.save(localTypesEquipment);*/
       /* return  *//*fridgeMapper.convertFridgeToDto(localTypesEquipment.getFridge());*/

    }

    @Override
    public Optional<List<FridgeDto>> getPosition(String incomingObject, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public FridgeDto changePosition(FridgeDto incomingObjectForChange) {
        return null;
    }

    @Override
    public boolean deletePosition(Integer deleteObject) {
        return true;
    }
}
