package com.registerofequipment.petRegisterOfEquipment.others.exeptions;

public enum DescriptionExeptions {

    GENERATION_ERROR("Возникла ошибка в системе"),
    NAME_TYPE_TECHNIC_NOT_FOUND("Возникла ошибка: попытка создать сущность без заполненного поля имя техники. Проверьте запрос и попробуйте ещё раз");

    private String description;

    DescriptionExeptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
