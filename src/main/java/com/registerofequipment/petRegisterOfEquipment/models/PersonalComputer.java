package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@Entity
@Table(name = "personal_computer_tech")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonalComputer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "processor_type")
    private String typeProcessor;
    @Column(name = "category")
    private String category;
    @Transient
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalComputer that = (PersonalComputer) o;
        return Objects.equals(id, that.id) && Objects.equals(typeProcessor, that.typeProcessor) && Objects.equals(category, that.category) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeProcessor, category, serviceFlag);
    }
}
