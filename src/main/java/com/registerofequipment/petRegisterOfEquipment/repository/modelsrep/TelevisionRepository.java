package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import com.registerofequipment.petRegisterOfEquipment.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TelevisionRepository extends JpaRepository<Television, Long> {

    Optional<List<Television>> findAllByCategory(String category);
    Optional<List<Television>> findAllByTechnology(String technology);

}
