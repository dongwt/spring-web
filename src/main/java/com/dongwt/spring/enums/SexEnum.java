package com.dongwt.spring.enums;

import lombok.Getter;
import lombok.Setter;

public enum SexEnum {

    MAN(1, "男"), WOMEN(2, "女");

    @Setter
    @Getter
    private Integer key;

    @Setter
    @Getter
    private String value;

    SexEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }



}
