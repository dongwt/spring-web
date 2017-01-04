package com.dongwt.spring.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class DateObj implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createDate;

}
