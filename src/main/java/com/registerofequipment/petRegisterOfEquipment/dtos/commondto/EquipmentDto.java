package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class EquipmentDto implements Serializable {

    private Integer id;
    private TypeEquipmentEnum nameTypeTechnic; //TV
    private ModelDto modelDtoDetails;
    private String manufacturerCountry; // Russia
    private String manufacturerCompany; // IBS
    private boolean isOrderOnline; // true
    private boolean isPossibilityInstallments; // true
    private List<ModelDto> modelsAvailabilityDto; //

    public EquipmentDto(Integer id, TypeEquipmentEnum nameTypeTechnic, ModelDto modelDtoDetails, String manufacturerCountry,
                        String manufacturerCompany, boolean isOrderOnline, boolean isPossibilityInstallments, List<ModelDto> modelsAvailabilityDto) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.modelDtoDetails = modelDtoDetails;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
        this.modelsAvailabilityDto = modelsAvailabilityDto;
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

    public ModelDto getModelDtoDetails() {
        return modelDtoDetails;
    }

    public void setModelDtoDetails(ModelDto modelDtoDetails) {
        this.modelDtoDetails = modelDtoDetails;
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

    public List<ModelDto> getModelsAvailabilityDto() {
        return modelsAvailabilityDto;
    }

    public void setModelsAvailabilityDto(List<ModelDto> modelsAvailabilityDto) {
        this.modelsAvailabilityDto = modelsAvailabilityDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentDto that = (EquipmentDto) o;
        return isOrderOnline == that.isOrderOnline && isPossibilityInstallments == that.isPossibilityInstallments && Objects.equals(id, that.id)
                && nameTypeTechnic == that.nameTypeTechnic && Objects.equals(modelDtoDetails, that.modelDtoDetails)
                && Objects.equals(manufacturerCountry, that.manufacturerCountry) && Objects.equals(manufacturerCompany, that.manufacturerCompany)
                && Objects.equals(modelsAvailabilityDto, that.modelsAvailabilityDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTypeTechnic, modelDtoDetails, manufacturerCountry, manufacturerCompany, isOrderOnline, isPossibilityInstallments,
                modelsAvailabilityDto);
    }
}
