package com.dongwt.spring.ctrl;

import com.dongwt.spring.api.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexCtrl {


	@RequestMapping(value="/index",method={RequestMethod.GET})
	public  Map<String,Object> index(HttpServletRequest request) {
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("status", 0);
		result.put("msg", "success");
		return result;
	}

	@RequestMapping("/noAppointMethod")
	public Response noAppointMethod(@RequestParam(value = "name",required = false) String name){
		Response response = Response.success();

		return response;
	}
	
}
