package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelevisionDto implements Serializable {

    private Integer id;
    private String category;
    private String technology;
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelevisionDto that = (TelevisionDto) o;
        return Objects.equals(id, that.id) && Objects.equals(category, that.category) && Objects.equals(technology, that.technology) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, technology, serviceFlag);
    }
}
