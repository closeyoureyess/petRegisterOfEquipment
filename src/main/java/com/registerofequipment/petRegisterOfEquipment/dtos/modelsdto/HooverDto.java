package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HooverDto implements Serializable {

    private Integer id;
    private Integer sizeDustCollect;
    private Integer countsRegime;
    private Integer serviceFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HooverDto hooverDto = (HooverDto) o;
        return Objects.equals(id, hooverDto.id) && Objects.equals(sizeDustCollect, hooverDto.sizeDustCollect) && Objects.equals(countsRegime, hooverDto.countsRegime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sizeDustCollect, countsRegime);
    }
}
