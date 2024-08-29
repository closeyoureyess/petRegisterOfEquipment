package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "tmodel_tech")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_device")
    private String nameDevice;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "types_equipment_id")
    private TypesEquipment typesEquipment;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "equipment_id")
    private Equipment equipmentField;
    @Column(name = "serial_number")
    private Integer serialNumber;
    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private ColorEquipment color;
    @Column(name = "size")
    private Integer size;
    @Column(name = "price")
    private Integer price;
    @Column(name = "availability_tmodel")
    private Boolean isAvailability;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(id, model.id) && Objects.equals(nameDevice, model.nameDevice) && Objects.equals(typesEquipment, model.typesEquipment) && Objects.equals(equipmentField, model.equipmentField) && Objects.equals(serialNumber, model.serialNumber) && color == model.color && Objects.equals(size, model.size) && Objects.equals(price, model.price) && Objects.equals(isAvailability, model.isAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameDevice, typesEquipment, equipmentField, serialNumber, color, size, price, isAvailability);
    }
}
