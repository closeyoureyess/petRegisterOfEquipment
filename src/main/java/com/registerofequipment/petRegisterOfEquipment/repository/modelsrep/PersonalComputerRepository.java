package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalComputerRepository extends JpaRepository<PersonalComputer, Long> {

}
