package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FridgeRepository extends JpaRepository<Fridge, Long> {

    Optional<List<Fridge>> findAllByCountsDoor(Integer countsDoor);
    Optional<List<Fridge>> findAllByTypeCompressor(String typeCompressor);

}
