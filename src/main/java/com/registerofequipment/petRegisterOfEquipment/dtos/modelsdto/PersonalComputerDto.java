package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonalComputerDto implements Serializable {
    private Integer id;
    private String typeProcessor;
    private String category;
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalComputerDto that = (PersonalComputerDto) o;
        return Objects.equals(id, that.id) && Objects.equals(typeProcessor, that.typeProcessor) && Objects.equals(category, that.category) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeProcessor, category, serviceFlag);
    }
}
