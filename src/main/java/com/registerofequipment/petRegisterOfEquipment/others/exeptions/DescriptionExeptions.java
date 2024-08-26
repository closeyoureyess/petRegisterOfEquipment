package com.registerofequipment.petRegisterOfEquipment.others.exeptions;

public enum DescriptionExeptions {

    GENERATION_ERROR("Возникла ошибка в системе"),
    FIELDS_NOT_NULL("Переменные не могут быть пусты. Попробуйте еще раз"),
    NAME_TYPE_TECHNIC_NOT_FOUND("попытка создать сущность без заполненного поля имя техники. Проверьте запрос и попробуйте ещё раз"),
    DIFFERENT_TYPES_TECHNICS("выбранный вид техники в классе-модели не совпадает с видом техники в позиции, к которой привязана модель. Проверьте запрос и попробуйте ещё раз");

    private String description;

    DescriptionExeptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
