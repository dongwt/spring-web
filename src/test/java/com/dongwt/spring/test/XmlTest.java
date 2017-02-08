package com.dongwt.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dongwt.spring.model.Address;
import com.dongwt.spring.model.User;
import com.thoughtworks.xstream.XStream;

public class XmlTest {
    
    @Test
    public void test(){
        
        String xml = java2Xml();
        System.out.println(xml);
        
        User user = xml2Java(xml);
        System.out.println(user);
       
    }
    
    public String java2Xml(){
        User user = new User();
        user.setUserName("tom");
        user.setPassword("111111");
        user.setAge(18);
        Address address1 = new Address(43,"上海");
        Address address2 = new Address(44,"北京");
        List<Address> addressList = new ArrayList<Address>();
        addressList.add(address1);
        addressList.add(address2);
        user.setAddresses(addressList);
        
        XStream xs = new XStream();
        xs.setMode(XStream.NO_REFERENCES);
        xs.processAnnotations(new Class[]{User.class,Address.class});
        
        return xs.toXML(user);
    }
    
    
    public User xml2Java(String xml){
        XStream xs = new XStream();
        xs.setMode(XStream.NO_REFERENCES);  
        xs.processAnnotations(new Class[]{User.class,Address.class});
        return (User)xs.fromXML(xml);
    }

}
