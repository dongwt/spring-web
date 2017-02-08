package com.dongwt.spring.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("address") 
public class Address implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private Integer cityId;
    
    private String cityName;
}
