package com.dongwt.spring.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SerializableObj implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 静态变量不会被序列化
     */
    public static String global = "global";
    
    private transient int intParams = 10;
    
    private transient boolean bParams = true;
    
    private transient Date date = new Date();

}
