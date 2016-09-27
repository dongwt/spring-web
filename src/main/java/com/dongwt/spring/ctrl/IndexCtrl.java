package com.dongwt.spring.ctrl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongwt.spring.service.RedisService;

@Controller
@RequestMapping("/")
public class IndexCtrl {

//	@Autowired
//	private RedisService RedisService;
	
	@RequestMapping(value="/index",method={RequestMethod.GET})
	public @ResponseBody Map<String,Object> index(HttpServletRequest request) {
		Map<String,Object> result = new HashMap<String, Object>();
//		RedisService.save("str", (String) request.getParameter("str"));
		result.put("status", 0);
		result.put("msg", "success");
		return result;
	}
	
}
