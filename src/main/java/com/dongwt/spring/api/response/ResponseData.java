package com.dongwt.spring.api.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResponseData<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T additional;

}
