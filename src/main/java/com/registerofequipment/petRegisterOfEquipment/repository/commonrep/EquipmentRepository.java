package com.registerofequipment.petRegisterOfEquipment.repository.commonrep;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.common.Model;
import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    Optional<List<Equipment>> findAllByNameTypeTechnic(TypeEquipmentEnum nameTypeTechnicEnum);
    Page<Equipment> findAllByNameTypeTechnic(TypeEquipmentEnum nameTypeTechnicEnum, Pageable pageable);

}
