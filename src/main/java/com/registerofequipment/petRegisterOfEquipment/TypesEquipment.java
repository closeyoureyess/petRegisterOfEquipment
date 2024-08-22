package com.registerofequipment.petRegisterOfEquipment;

import com.registerofequipment.petRegisterOfEquipment.models.*;
import jakarta.persistence.*;

@Entity
@Table(name = "types_equipment")
public class TypesEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fridge_id")
    private Fridge fridge;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hoover_id")
    private Hoover hoover;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_computer_id")
    private PersonalComputer personalComputer;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "smartphone_id")
    private Smartphone smartphone;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "television_id")
    private Television television;
}
