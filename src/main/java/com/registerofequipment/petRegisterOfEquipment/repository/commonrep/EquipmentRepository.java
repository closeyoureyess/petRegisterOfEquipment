package com.registerofequipment.petRegisterOfEquipment.repository.commonrep;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
