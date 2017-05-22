package com.dongwt.spring.test;

import com.dongwt.spring.enums.SexEnum;

/**
 * @Description:
 * @author: dongwt
 * @create: 2017-05-22 11:42
 **/
public class EnumTest {

    public static void main(String[] args) {
        Class<SexEnum> clazz = SexEnum.class;
        SexEnum[] sexEnum = clazz.getEnumConstants();
        for(SexEnum item : sexEnum){
            System.out.println(item.getKey()+":"+item.getValue());
        }
    }
}
