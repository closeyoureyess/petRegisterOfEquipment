package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.FridgeDto;
import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.HooverDto;
import com.registerofequipment.petRegisterOfEquipment.models.Fridge;
import com.registerofequipment.petRegisterOfEquipment.models.Hoover;
import com.registerofequipment.petRegisterOfEquipment.others.ConstantsClass;
import org.springframework.stereotype.Component;

@Component
public class HooverMapper {

    public Hoover convertDtoToHoover(HooverDto hooverDto) {
        Hoover hoover = new Hoover();
        if (hooverDto != null) {
            hoover.setId(hooverDto.getId());
            hoover.setCountsRegime(hooverDto.getCountsRegime());
            hoover.setSizeDustCollect(hooverDto.getSizeDustCollect());
        }
        return hoover;
    }

    public HooverDto convertHooverToDto(Hoover hoover) {
        HooverDto hooverDto = new HooverDto();
        if (hoover != null) {
            hooverDto.setId(hoover.getId());
            hooverDto.setCountsRegime(hoover.getCountsRegime());
            hooverDto.setSizeDustCollect(hoover.getSizeDustCollect());
        }
        return hooverDto;
    }

    public Hoover compareHooverAndDto(HooverDto hooverDto, Hoover hoover) {
        if (hoover != null && hooverDto != null) {
            hoover = compareSizeDustCollectAndDto(hooverDto, hoover);
            hoover = compareCountsRegimeAndDto(hooverDto, hoover);
        }
        return hoover;
    }
    private Hoover compareSizeDustCollectAndDto(HooverDto hooverDto, Hoover hoover){
        if (!hooverDto.getSizeDustCollect().equals(hoover.getSizeDustCollect())) {
            hoover.setServiceFlag(ConstantsClass.ONE_FLAG);
            hoover.setSizeDustCollect(hooverDto.getSizeDustCollect());
        }
        return hoover;
    }

    private Hoover compareCountsRegimeAndDto(HooverDto hooverDto, Hoover hoover){
        if (!hooverDto.getCountsRegime().equals(hoover.getCountsRegime())) {
            hoover.setServiceFlag(ConstantsClass.ONE_FLAG);
            hoover.setCountsRegime(hooverDto.getCountsRegime());
        }
        return hoover;
    }
}
