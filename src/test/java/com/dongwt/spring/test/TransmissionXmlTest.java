package com.dongwt.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.dongwt.spring.model.Address;
import com.dongwt.spring.model.User;
import com.thoughtworks.xstream.XStream;

public class TransmissionXmlTest {

    public String java2Xml() {
        User user = new User();
        user.setUserName("tom");
        user.setPassword("111111");
        user.setAge(18);
        Address address1 = new Address(43, "上海");
        Address address2 = new Address(44, "北京");
        List<Address> addressList = new ArrayList<Address>();
        addressList.add(address1);
        addressList.add(address2);
        user.setAddresses(addressList);

        XStream xs = new XStream();
        xs.setMode(XStream.NO_REFERENCES);
        xs.processAnnotations(new Class[] { User.class, Address.class });

        return xs.toXML(user);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void test() throws Exception {

        HttpClient client = HttpClients.createDefault();

        HttpPost post = new HttpPost("http://127.0.0.1:8080/spring-web/xml/handelXml");

        post.setEntity(new StringEntity(java2Xml(), "text/xml", "utf-8"));

        HttpResponse response = client.execute(post);
        
        HttpEntity entity = response.getEntity();  
        String result = EntityUtils.toString(entity, "UTF-8"); 

        System.out.println("client接收响应: " + result);

    }

}
