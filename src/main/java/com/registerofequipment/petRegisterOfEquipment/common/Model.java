package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.others.ColorEquipment;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tmodel_tech")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "unique_name_device")
    private String nameDevice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "types_equipment_id")
    private TypesEquipment typesEquipment;
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
    private boolean isAvailability;
    @ManyToMany(mappedBy = "modelsAvailability", fetch = FetchType.LAZY)
    private List<Equipment> equipmentList;

    public Model(Integer id, String nameDevice, TypesEquipment typesEquipment, Integer serialNumber, ColorEquipment color, Integer size,
                 Integer price, boolean isAvailability, List<Equipment> equipmentList) {
        this.id = id;
        this.nameDevice = nameDevice;
        this.typesEquipment = typesEquipment;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isAvailability = isAvailability;
        this.equipmentList = equipmentList;
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

    public boolean getIsAvailability() {
        return isAvailability;
    }

    public void setAvailability(boolean availability) {
        isAvailability = availability;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }
}
