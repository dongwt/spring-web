package com.dongwt.spring.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class DateObj{
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createDate;

}
