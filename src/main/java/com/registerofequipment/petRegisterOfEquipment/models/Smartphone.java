package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "smartphone_tech")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "memory")
    private Integer memoryPhone;
    @Column(name = "numbercount_snaps")
    private Integer countsSnaps;
    @Transient
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(id, that.id) && Objects.equals(memoryPhone, that.memoryPhone) && Objects.equals(countsSnaps, that.countsSnaps) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memoryPhone, countsSnaps, serviceFlag);
    }
}
