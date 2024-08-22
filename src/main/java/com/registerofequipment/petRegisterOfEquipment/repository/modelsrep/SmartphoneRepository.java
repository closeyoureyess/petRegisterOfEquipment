package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {

}
