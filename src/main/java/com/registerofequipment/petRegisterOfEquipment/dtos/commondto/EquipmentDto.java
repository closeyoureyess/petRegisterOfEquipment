package com.registerofequipment.petRegisterOfEquipment.dtos.commondto;

import com.registerofequipment.petRegisterOfEquipment.others.TypeEquipmentEnum;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDto implements Serializable {

    private Integer id;
    private TypeEquipmentEnum nameTypeTechnic; //TV
    private String manufacturerCountry; // Russia
    private String manufacturerCompany; // IBS
    private Boolean isOrderOnline; // true
    private Boolean isPossibilityInstallments; // true
    private Integer serviceFlag;

    public EquipmentDto(Integer id, TypeEquipmentEnum nameTypeTechnic, String manufacturerCountry, String manufacturerCompany, Boolean isOrderOnline, Boolean isPossibilityInstallments) {
        this.id = id;
        this.nameTypeTechnic = nameTypeTechnic;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerCompany = manufacturerCompany;
        this.isOrderOnline = isOrderOnline;
        this.isPossibilityInstallments = isPossibilityInstallments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentDto that = (EquipmentDto) o;
        return Objects.equals(id, that.id) && nameTypeTechnic == that.nameTypeTechnic && Objects.equals(manufacturerCountry, that.manufacturerCountry) && Objects.equals(manufacturerCompany, that.manufacturerCompany) && Objects.equals(isOrderOnline, that.isOrderOnline) && Objects.equals(isPossibilityInstallments, that.isPossibilityInstallments) && Objects.equals(serviceFlag, that.serviceFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTypeTechnic, manufacturerCountry, manufacturerCompany, isOrderOnline, isPossibilityInstallments, serviceFlag);
    }
}
