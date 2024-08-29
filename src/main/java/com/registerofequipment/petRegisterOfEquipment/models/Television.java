package com.registerofequipment.petRegisterOfEquipment.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "television_tech")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Television {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "category_tv")
    private String category;
    @Column(name = "technology_tv")
    private String technology;
    @Transient
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return Objects.equals(id, that.id) && Objects.equals(category, that.category) && Objects.equals(technology, that.technology) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, technology, serviceFlag);
    }
}
