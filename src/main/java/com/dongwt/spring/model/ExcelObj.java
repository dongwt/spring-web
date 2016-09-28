package com.dongwt.spring.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.dongwt.spring.annotation.OperateField;

public class ExcelObj {
    
    @OperateField(name="用户名",prefix="[",suffix="]")
    private String userName;//用户名
    
    @OperateField(name="年龄",isExclude=true)
    private Integer age;//年龄
    
    @OperateField(name="性别",trueValue="男",falseValue="女")
    private Boolean sex;//性别
    
    @OperateField(name="手机号",isExclude=true)
    private String phone;//手机号
    
    @OperateField(name="地址",isExclude=true)
    private String address;//地址
    
    @OperateField(name="",datePattern="yyyy-MM-dd hh:mm:ss")
    private Date birthday;//出生日期
    

    public ExcelObj() {
    }
    
    

    public ExcelObj(String userName, Integer age, Boolean sex, String phone, String address,Date birthday) {
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
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
