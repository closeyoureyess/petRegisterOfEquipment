package com.registerofequipment.petRegisterOfEquipment;

import com.registerofequipment.petRegisterOfEquipment.models.*;
import jakarta.persistence.*;

@Entity
@Table(name = "types_equipment")
public class TypesEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fridge")
    @JoinColumn()
    private Fridge fridge;
    @Column(name = "hoover")
    private Hoover hoover;
    @Column(name = "personal_computer")
    private PersonalComputer personalComputer;
    @Column(name = "smartphone")
    private Smartphone smartphone;
    @Column(name = "television")
    private Television television;
}
