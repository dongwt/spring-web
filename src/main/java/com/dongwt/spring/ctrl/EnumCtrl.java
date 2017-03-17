package com.dongwt.spring.ctrl;

import com.dongwt.spring.api.request.User;
import com.dongwt.spring.api.response.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enum")
public class EnumCtrl {

    @RequestMapping(value="enumTest",method = RequestMethod.POST)
    public Response<User,String> enumTest(@RequestBody User user){
        Response<User,String> response = Response.success();

        response.setData(user);

        return response;
    }

}
