package com.dongwt.spring.utils;

import com.dongwt.spring.enums.SexEnum;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;


public class EnumDeserializer extends JsonDeserializer<SexEnum> {
    @Override
    public SexEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();

        for (SexEnum item : SexEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }
        return null;
    }
}
