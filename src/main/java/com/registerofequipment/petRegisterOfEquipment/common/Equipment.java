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
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "types_equipment_id")
    private Model modelDetails;
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

    public Equipment(Integer id, TypeEquipmentEnum nameTypeTechnic, Model modelDetails, String manufacturerCountry,
                     String manufacturerCompany, boolean isOrderOnline, boolean isPossibilityInstallments, List<Model> modelsAvailability) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.modelDetails = modelDetails;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
        this.modelsAvailability = modelsAvailability;
    }

    public Equipment(Integer id, TypeEquipmentEnum nameTypeTechnic, Model modelDetails, String manufacturerCountry,
                     String manufacturerCompany, boolean isOrderOnline, boolean isPossibilityInstallments) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.modelDetails = modelDetails;
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

    public Model getModelDetails() {
        return modelDetails;
    }

    public void setModelDetails(Model modelDetails) {
        this.modelDetails = modelDetails;
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

    public boolean getIsOrderOnline() {
        return isOrderOnline;
    }

    public void setIsOrderOnline(boolean orderOnline) {
        isOrderOnline = orderOnline;
    }

    public boolean getIsPossibilityInstallments() {
        return isPossibilityInstallments;
    }

    public void setIsPossibilityInstallments(boolean possibilityInstallments) {
        isPossibilityInstallments = possibilityInstallments;
    }

    public List<Model> getModelsAvailability() {
        return modelsAvailability;
    }

    public void setModelsAvailability(List<Model> modelsAvailability) {
        this.modelsAvailability = modelsAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return isOrderOnline == equipment.isOrderOnline && isPossibilityInstallments == equipment.isPossibilityInstallments && Objects.equals(id, equipment.id) && nameTypeTechnic == equipment.nameTypeTechnic && Objects.equals(modelDetails, equipment.modelDetails) && Objects.equals(manufacturerCountry, equipment.manufacturerCountry) && Objects.equals(manufacturerCompany, equipment.manufacturerCompany) && Objects.equals(modelsAvailability, equipment.modelsAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTypeTechnic, modelDetails, manufacturerCountry, manufacturerCompany, isOrderOnline, isPossibilityInstallments, modelsAvailability);
    }
}
