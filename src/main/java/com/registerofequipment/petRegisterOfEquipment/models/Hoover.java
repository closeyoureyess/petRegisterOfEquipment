package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@Entity
@Table(name = "hoover_tech")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hoover {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "size_dust_collect")
    private Integer sizeDustCollect;
    @Column(name = "numbercount_regime")
    private Integer countsRegime;
    @Transient
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hoover hoover = (Hoover) o;
        return Objects.equals(id, hoover.id) && Objects.equals(sizeDustCollect, hoover.sizeDustCollect) && Objects.equals(countsRegime, hoover.countsRegime) && Objects.equals(serviceFlag, hoover.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sizeDustCollect, countsRegime, serviceFlag);
    }
}
