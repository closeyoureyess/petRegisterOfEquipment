package com.registerofequipment.petRegisterOfEquipment.dtos;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.*;
import com.registerofequipment.petRegisterOfEquipment.models.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypesEquipmentDto implements Serializable {

    private Integer id;
    private FridgeDto fridgeDto;
    private HooverDto hooverDto;
    private PersonalComputerDto personalComputerDto;
    private SmartphoneDto smartphoneDto;
    private TelevisionDto televisionDto;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypesEquipmentDto that = (TypesEquipmentDto) o;
        return Objects.equals(id, that.id) && Objects.equals(fridgeDto, that.fridgeDto) && Objects.equals(hooverDto, that.hooverDto) && Objects.equals(personalComputerDto, that.personalComputerDto) && Objects.equals(smartphoneDto, that.smartphoneDto) && Objects.equals(televisionDto, that.televisionDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fridgeDto, hooverDto, personalComputerDto, smartphoneDto, televisionDto);
    }
}
