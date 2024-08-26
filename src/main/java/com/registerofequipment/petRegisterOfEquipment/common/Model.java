package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tmodel_tech")
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

    public Model(Integer id, String nameDevice, TypesEquipment typesEquipment, Equipment equipmentField, Integer serialNumber, ColorEquipment color,
                 Integer size, Integer price, Boolean isAvailability) {
        this.id = id;
        this.nameDevice = nameDevice;
        this.typesEquipment = typesEquipment;
        this.equipmentField = equipmentField;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isAvailability = isAvailability;
    }

    public Model(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public TypesEquipment getTypesEquipment() {
        return typesEquipment;
    }

    public void setTypesEquipment(TypesEquipment typesEquipment) {
        this.typesEquipment = typesEquipment;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ColorEquipment getColor() {
        return color;
    }

    public void setColor(ColorEquipment color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getIsAvailability() {
        return isAvailability;
    }

    public void setAvailability(Boolean availability) {
        isAvailability = availability;
    }

    public Equipment getEquipmentField() {
        return equipmentField;
    }

    public void setEquipmentField(Equipment equipmentField) {
        this.equipmentField = equipmentField;
    }

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
