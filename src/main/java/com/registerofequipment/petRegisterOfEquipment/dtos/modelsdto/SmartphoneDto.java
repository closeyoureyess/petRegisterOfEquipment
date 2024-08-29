package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmartphoneDto implements Serializable {

    private Integer id;
    private Integer memoryPhone;
    private Integer countsSnaps;
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphoneDto that = (SmartphoneDto) o;
        return Objects.equals(id, that.id) && Objects.equals(memoryPhone, that.memoryPhone) && Objects.equals(countsSnaps, that.countsSnaps) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memoryPhone, countsSnaps, serviceFlag);
    }
}
