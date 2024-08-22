package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelevisionRepository extends JpaRepository<Television, Long> {

}
