package com.registerofequipment.petRegisterOfEquipment.repository;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesEquipmentRepository extends JpaRepository<TypesEquipment, Long> {

    TypesEquipment findByFridgeId(Long fileFridgeId);
    TypesEquipment findByHooverId(Long fileHooverId);
    TypesEquipment findByPersonalComputerId(Long filePersonalComputerId);
    TypesEquipment findBySmartphoneId(Long fileSmartphoneId);
    TypesEquipment findByTelevisionId(Long fileTelevisionId);
}
