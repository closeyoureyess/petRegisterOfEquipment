package com.registerofequipment.petRegisterOfEquipment.repository.commonrep;

import com.registerofequipment.petRegisterOfEquipment.common.Equipment;
import com.registerofequipment.petRegisterOfEquipment.common.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    List<Equipment> findAllByNameTypeTechnic(String nameTypeTechnic);
    Page<Equipment> findAllByNameTypeTechnic(String nameDevice, Pageable pageable);

}
