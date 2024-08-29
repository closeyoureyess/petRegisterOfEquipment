package com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto;

import com.registerofequipment.petRegisterOfEquipment.common.TypesEquipment;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FridgeDto implements Serializable {
    private Integer id;
    private Integer countsDoor;
    private String typeCompressor;
    private Integer serviceFlag;
}
