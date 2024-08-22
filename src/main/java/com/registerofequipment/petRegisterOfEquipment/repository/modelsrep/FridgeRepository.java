package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeRepository extends JpaRepository<Fridge, Long> {

}
