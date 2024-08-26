package com.registerofequipment.petRegisterOfEquipment.repository.modelsrep;

import com.registerofequipment.petRegisterOfEquipment.models.Hoover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HooverRepository extends JpaRepository<Hoover, Long> {

    Optional<List<Hoover>> findAllBySizeDustCollect(Integer countsDoor);
    Optional<List<Hoover>> findAllByCountsRegime(Integer countsRegime);

}
