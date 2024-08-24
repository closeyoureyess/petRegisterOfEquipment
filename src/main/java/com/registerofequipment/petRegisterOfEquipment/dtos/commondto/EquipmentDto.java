package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;

import java.io.Serializable;
import java.util.Objects;

public class EquipmentDto implements Serializable {

    private Integer id;
    private TypeEquipmentEnum nameTypeTechnic; //TV
    private String manufacturerCountry; // Russia
    private String manufacturerCompany; // IBS
    private boolean isOrderOnline; // true
    private boolean isPossibilityInstallments; // true
    private Integer serviceFlag;

    public EquipmentDto(Integer id, TypeEquipmentEnum nameTypeTechnic, String manufacturerCountry, String manufacturerCompany,
                        boolean isOrderOnline, boolean isPossibilityInstallments, Integer serviceFlag) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
        this.serviceFlag = serviceFlag;
    }

    public EquipmentDto(Integer id, TypeEquipmentEnum nameTypeTechnic, String manufacturerCountry, String manufacturerCompany,
                        boolean isOrderOnline, boolean isPossibilityInstallments) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
        this.serviceFlag = serviceFlag;
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
        EquipmentDto that = (EquipmentDto) o;
        return isOrderOnline == that.isOrderOnline && isPossibilityInstallments == that.isPossibilityInstallments && Objects.equals(id, that.id) && nameTypeTechnic == that.nameTypeTechnic && Objects.equals(manufacturerCountry, that.manufacturerCountry) && Objects.equals(manufacturerCompany, that.manufacturerCompany) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTypeTechnic, manufacturerCountry, manufacturerCompany, isOrderOnline, isPossibilityInstallments, serviceFlag);
    }
}
