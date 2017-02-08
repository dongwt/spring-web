package com.dongwt.spring.ctrl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dongwt.spring.model.Address;
import com.dongwt.spring.model.User;
import com.dongwt.spring.utils.XmlUtils;

@Controller
@RequestMapping("/xml")
public class XmlCtrl {
    
    
    @RequestMapping(value="handelXml",method=RequestMethod.POST)
    public void handelXml(HttpServletRequest request,HttpServletResponse response) throws IOException{
        
        @SuppressWarnings("rawtypes")
        Class[] clazzs = new Class[]{User.class,Address.class};
        
//        String sb = XmlUtils.getRequestEntityStr(request);
//        
//        System.out.println("service接收请求: " + sb);
        
//        User user = XmlUtils.xml2Obj(clazzs,sb);
        
        User user = XmlUtils.getRequestEntityObj(request, clazzs);
                
        user.setUserName("我修改了");
        
        XmlUtils.responseXml(clazzs, user, response);
    }

}
