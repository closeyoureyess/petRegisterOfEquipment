package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonalComputerRepository extends JpaRepository<PersonalComputer, Long> {

    Optional<List<PersonalComputer>> findAllByTypeProcessor(String typeProcessor);
    Optional<List<PersonalComputer>> findAllByCategory(String category);

}
