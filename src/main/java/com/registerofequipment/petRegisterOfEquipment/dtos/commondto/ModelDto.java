package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.dtos.TypesEquipmentDto;
import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelDto implements Serializable {

    private Integer id;
    private String nameDevice;
    private TypesEquipmentDto typesEquipmentDto;
    private EquipmentDto equipmentDto;
    private Integer serialNumber;
    private ColorEquipment color;
    private Integer size;
    private Integer price;
    private Boolean isAvailability;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelDto modelDto = (ModelDto) o;
        return Objects.equals(id, modelDto.id) && Objects.equals(nameDevice, modelDto.nameDevice) && Objects.equals(typesEquipmentDto, modelDto.typesEquipmentDto) && Objects.equals(equipmentDto, modelDto.equipmentDto) && Objects.equals(serialNumber, modelDto.serialNumber) && color == modelDto.color && Objects.equals(size, modelDto.size) && Objects.equals(price, modelDto.price) && Objects.equals(isAvailability, modelDto.isAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameDevice, typesEquipmentDto, equipmentDto, serialNumber, color, size, price, isAvailability);
    }
}
