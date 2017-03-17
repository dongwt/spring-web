package com.dongwt.spring.api.request;

import com.dongwt.spring.enums.SexEnum;
import com.dongwt.spring.utils.EnumDeserializer;
import com.dongwt.spring.utils.EnumSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    @JsonSerialize(using = EnumSerializer.class)
    @JsonDeserialize(using= EnumDeserializer.class)
    private SexEnum sex;
}
