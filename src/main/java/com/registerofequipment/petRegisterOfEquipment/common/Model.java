package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.models.PersonalComputer;
import com.registerofequipment.petRegisterOfEquipment.models.Smartphone;
import com.registerofequipment.petRegisterOfEquipment.models.Television;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "umodel_tech")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "unique_name_device")
    private String nameDevice;
    @ManyTo
    @JoinColumn(name = "types_equipment")
    private TypesEquipment typesEquipment;
    @Column(name = "serial_number")
    private Integer serialNumber;
    @Column(name = "color")
    private String color;
    @Column(name = "size")
    private Integer size;
    @Column(name = "price")
    private Integer price;
    @Column(name = "availability_umodel")
    private boolean isAvailability;
    @ManyToMany(mappedBy = "modelsAvailability", fetch = FetchType.LAZY)
    private List<Equipment> equipmentList;

}
