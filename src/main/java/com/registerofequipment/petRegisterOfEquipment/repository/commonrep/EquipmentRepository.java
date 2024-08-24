package com.registerofequipment.petRegisterOfEquipment.repository.commonrep;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    List<Equipment> findAllByNameTypeTechnic(String nameTypeTechnic);
}
