package com.registerofequipment.petRegisterOfEquipment.mapper.modelsmapper;

import com.registerofequipment.petRegisterOfEquipment.dtos.modelsdto.HooverDto;
import com.registerofequipment.petRegisterOfEquipment.models.Hoover;
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
}
