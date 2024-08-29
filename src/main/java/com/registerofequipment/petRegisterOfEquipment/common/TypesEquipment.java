package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.models.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "types_equipment")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypesEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fridge_id")
    private Fridge fridge;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "hoover_id")
    private Hoover hoover;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "personal_computer_id")
    private PersonalComputer personalComputer;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "smartphone_id")
    private Smartphone smartphone;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "television_id")
    private Television television;
    @OneToMany(mappedBy = "typesEquipment")
    private List<Model> modelsList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypesEquipment that = (TypesEquipment) o;
        return Objects.equals(id, that.id) && Objects.equals(fridge, that.fridge) && Objects.equals(hoover, that.hoover) && Objects.equals(personalComputer, that.personalComputer) && Objects.equals(smartphone, that.smartphone) && Objects.equals(television, that.television);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fridge, hoover, personalComputer, smartphone, television);
    }
}
