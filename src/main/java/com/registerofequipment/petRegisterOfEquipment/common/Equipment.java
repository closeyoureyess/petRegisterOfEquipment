package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.TypesEquipment;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_type_technic")
    private String nameTypeTechnic; //TV
    @Column(name = "types_equipment")
    private TypesEquipment typesEquipment;
    @Column(name = "manufacturer_country")
    private String manufacturerCountry; // Russia
    @Column(name = "manufacturer_company")
    private String manufacturerCompany; // IBS
    @Column(name = "order_online")
    private boolean isOrderOnline; // true
    @Column(name = "possibility_installments")
    private boolean isPossibilityInstallments; // true
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Model> modelsAvailability; //

}
