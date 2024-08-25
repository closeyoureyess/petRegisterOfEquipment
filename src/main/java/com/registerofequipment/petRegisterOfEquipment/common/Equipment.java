package com.registerofequipment.petRegisterOfEquipment.common;

import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_type_technic")
    @Enumerated(EnumType.STRING)
    private TypeEquipmentEnum nameTypeTechnic; //TV
    @Column(name = "manufacturer_country")
    private String manufacturerCountry; // Russia
    @Column(name = "manufacturer_company")
    private String manufacturerCompany; // IBS
    @Column(name = "order_online")
    private Boolean isOrderOnline; // tr
    @Column(name = "possibility_installments")
    private Boolean isPossibilityInstallments; // true
    @OneToMany(mappedBy = "equipment")
    private List<Model> models; // Обратите внимание на изменение типа поля
    /*@OneToMany(mappedBy = "equipment")
    private Model model;*/
    private Integer serviceFlag;

    public Equipment(Integer id, TypeEquipmentEnum nameTypeTechnic, String manufacturerCountry, String manufacturerCompany,
                     Boolean isOrderOnline, Boolean isPossibilityInstallments, Integer serviceFlag) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
        this.serviceFlag = serviceFlag;
    }

    public Equipment(Integer id, TypeEquipmentEnum nameTypeTechnic, String manufacturerCountry, String manufacturerCompany,
                     Boolean isOrderOnline, Boolean isPossibilityInstallments) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
    }

    public Equipment() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeEquipmentEnum getNameTypeTechnic() {
        return nameTypeTechnic;
    }

    public void setNameTypeTechnic(TypeEquipmentEnum nameTypeTechnic) {
        this.nameTypeTechnic = nameTypeTechnic;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getManufacturerCompany() {
        return manufacturerCompany;
    }

    public void setManufacturerCompany(String manufacturerCompany) {
        this.manufacturerCompany = manufacturerCompany;
    }

    public Boolean getIsOrderOnline() {
        return isOrderOnline;
    }

    public void setIsOrderOnline(Boolean orderOnline) {
        isOrderOnline = orderOnline;
    }

    public Boolean getIsPossibilityInstallments() {
        return isPossibilityInstallments;
    }

    public void setIsPossibilityInstallments(Boolean possibilityInstallments) {
        isPossibilityInstallments = possibilityInstallments;
    }

    public Integer getServiceFlag() {
        return serviceFlag;
    }

    public void setServiceFlag(Integer serviceFlag) {
        this.serviceFlag = serviceFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(id, equipment.id) && nameTypeTechnic == equipment.nameTypeTechnic && Objects.equals(manufacturerCountry, equipment.manufacturerCountry) && Objects.equals(manufacturerCompany, equipment.manufacturerCompany) && Objects.equals(isOrderOnline, equipment.isOrderOnline) && Objects.equals(isPossibilityInstallments, equipment.isPossibilityInstallments) && Objects.equals(serviceFlag, equipment.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTypeTechnic, manufacturerCountry, manufacturerCompany, isOrderOnline, isPossibilityInstallments, serviceFlag);
    }
}
