package com.registerofequipment.petRegisterOfEquipment.models;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "fridge_tech")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numbercount_door")
    private Integer countsDoor;
    @Column(name = "compressor_type")
    private String typeCompressor;
    @Transient
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fridge fridge = (Fridge) o;
        return Objects.equals(id, fridge.id) && Objects.equals(countsDoor, fridge.countsDoor) && Objects.equals(typeCompressor, fridge.typeCompressor) && Objects.equals(serviceFlag, fridge.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countsDoor, typeCompressor, serviceFlag);
    }
}
