package com.dongwt.spring.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.dongwt.spring.annotation.OperateField;

public class ExcelObj {
    
    @OperateField(prefix="[",suffix="]")
    private String userName;//用户名
    
    @OperateField(isExclude=false)
    private Integer age;//年龄
    
    private String sex;//性别
    
    private String phone;//手机号
    
    private String address;//地址
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;//出生日期
    

    public ExcelObj() {
    }
    
    

    public ExcelObj(String userName, Integer age, String sex, String phone, String address,Date birthday) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Date getBirthday() {
        return birthday;
    }



    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    

}
