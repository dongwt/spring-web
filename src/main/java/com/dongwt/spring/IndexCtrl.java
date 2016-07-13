package com.dongwt.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexCtrl {

	
	@RequestMapping(value="/index",method={RequestMethod.GET})
	public @ResponseBody Map<String,Object> index() {
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("status", 0);
		result.put("msg", "success");
		return result;
	}
	
}
