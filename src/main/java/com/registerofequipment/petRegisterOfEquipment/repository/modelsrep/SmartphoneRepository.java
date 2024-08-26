package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {

    Optional<List<Smartphone>> findAllByMemoryPhone(Integer memoryPhone);
    Optional<List<Smartphone>> findAllByCountsSnaps(Integer countsSnaps);

}
