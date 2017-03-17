package com.dongwt.spring.utils;

import com.dongwt.spring.enums.SexEnum;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;


public class EnumSerializer extends JsonSerializer<SexEnum> {
    @Override
    public void serialize(SexEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getValue());
    }
}
