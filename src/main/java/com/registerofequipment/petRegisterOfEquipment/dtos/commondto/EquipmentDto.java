package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.TypesEquipment;
import com.registerofequipment.petRegisterOfEquipment.common.Model;
import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class EquipmentDto implements Serializable {

    private Integer id;
    private TypeEquipmentEnum nameTypeTechnic; //TV
    private Model modelDetails;
    private String manufacturerCountry; // Russia
    private String manufacturerCompany; // IBS
    private boolean isOrderOnline; // true
    private boolean isPossibilityInstallments; // true
    private List<Model> modelsAvailability; //

    public EquipmentDto(Integer id, TypeEquipmentEnum nameTypeTechnic, Model modelDetails, String manufacturerCountry,
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

    public EquipmentDto(){

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

    public boolean isOrderOnline() {
        return isOrderOnline;
    }

    public void setOrderOnline(boolean orderOnline) {
        isOrderOnline = orderOnline;
    }

    public boolean isPossibilityInstallments() {
        return isPossibilityInstallments;
    }

    public void setPossibilityInstallments(boolean possibilityInstallments) {
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
        EquipmentDto that = (EquipmentDto) o;
        return isOrderOnline == that.isOrderOnline && isPossibilityInstallments == that.isPossibilityInstallments && Objects.equals(id, that.id)
                && nameTypeTechnic == that.nameTypeTechnic && Objects.equals(modelDetails, that.modelDetails)
                && Objects.equals(manufacturerCountry, that.manufacturerCountry) && Objects.equals(manufacturerCompany, that.manufacturerCompany)
                && Objects.equals(modelsAvailability, that.modelsAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTypeTechnic, modelDetails, manufacturerCountry, manufacturerCompany, isOrderOnline, isPossibilityInstallments,
                modelsAvailability);
    }
}
