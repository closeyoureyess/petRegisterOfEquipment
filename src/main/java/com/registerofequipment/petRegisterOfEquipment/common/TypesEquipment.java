package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.models.*;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "types_equipment")
public class TypesEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fridge_id")
    private Fridge fridge;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "hoover_id")
    private Hoover hoover;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "personal_computer_id")
    private PersonalComputer personalComputer;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "smartphone_id")
    private Smartphone smartphone;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "television_id")
    private Television television;

    public TypesEquipment(Integer id, Fridge fridge, Hoover hoover, PersonalComputer personalComputer, Smartphone smartphone, Television television) {
        this.id = id;
        this.fridge = fridge;
        this.hoover = hoover;
        this.personalComputer = personalComputer;
        this.smartphone = smartphone;
        this.television = television;
    }

    public TypesEquipment(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public Hoover getHoover() {
        return hoover;
    }

    public void setHoover(Hoover hoover) {
        this.hoover = hoover;
    }

    public PersonalComputer getPersonalComputer() {
        return personalComputer;
    }

    public void setPersonalComputer(PersonalComputer personalComputer) {
        this.personalComputer = personalComputer;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypesEquipment that = (TypesEquipment) o;
        return Objects.equals(id, that.id) && Objects.equals(fridge, that.fridge) && Objects.equals(hoover, that.hoover) && Objects.equals(personalComputer, that.personalComputer) && Objects.equals(smartphone, that.smartphone) && Objects.equals(television, that.television);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fridge, hoover, personalComputer, smartphone, television);
    }
}
