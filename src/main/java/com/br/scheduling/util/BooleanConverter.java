package com.br.scheduling.util;

import javax.persistence.AttributeConverter;

public class BooleanConverter implements AttributeConverter<Boolean, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Boolean aBoolean) {
        return aBoolean ? 1 : 0;
    }

    @Override
    public Boolean convertToEntityAttribute(Integer integer) {
        return integer.equals(Integer.valueOf(1)) ? Boolean.TRUE : Boolean.FALSE;
    }
}
