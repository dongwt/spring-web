package com.dongwt.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.dongwt.spring.api.pagination.CommonPagination;
import com.dongwt.spring.api.pagination.Pagination;
import com.dongwt.spring.api.request.BasePageRequest;
import com.dongwt.spring.api.response.Response;
import com.dongwt.spring.model.Address;
import com.dongwt.spring.model.User;

public class DataTest {

    @Test
    public void commonDataTest() {

        Response<User, Address> response = new Response<User, Address>();

        User user = new User();
        user.setUserName("tom");
        user.setPassword("111111");
        user.setAge(18);

        Address address = new Address(43, "上海");

        response.setData(user);
        response.setAdditional(address);

        System.out.println(JSONObject.toJSON(response));
    }
    
    
    @Test
    public void pageDataTest() {

        Response<Pagination<User>,Address> response = new Response<Pagination<User>,Address>();
        
        Pagination<User> data = new CommonPagination<User>();

        List<User> items = new ArrayList<User>();
        
        for(int i=0; i<3; i++){
            User user = new User();
            user.setUserName("tom" + i);
            user.setPassword("111111");
            user.setAge(i);
            items.add(user);
        }
        Address address = new Address(43, "上海");
        data.setItems(items);
        data.setTotal(items.size());
        
        
        BasePageRequest request = new BasePageRequest(7, 10, "name", "asc");
        
        System.out.println("Offset: " + request.getOffset());
        
        data.setPage(request);

        response.setAdditional(address);
        response.setData(data);
        
        System.out.println(JSONObject.toJSON(response));
    }

}
