package com.dongwt.spring.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("user")
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @XStreamAsAttribute()
    private String userName;
    
    private String password;
    
    private Integer age;
    
    private List<Address> addresses;

}
