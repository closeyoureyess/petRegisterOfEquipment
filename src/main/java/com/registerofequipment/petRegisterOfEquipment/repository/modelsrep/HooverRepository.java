package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Hoover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HooverRepository extends JpaRepository<Hoover, Long> {

}
