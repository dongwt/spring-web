package com.dongwt.spring.ctrl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongwt.spring.model.DateObj;
import com.dongwt.spring.model.ParamsObj;

@Controller
@RequestMapping("/params")
public class ParamsCtrl extends BaseCtrl{
    
    @RequestMapping(value="/arrayTest",method=RequestMethod.POST)
    @ResponseBody
    public int[] arrayTest(@RequestBody int[] array){
        return array;
    }
    
    @RequestMapping(value="/objectArrayTest",method=RequestMethod.POST)
    @ResponseBody
    public int[] objectArrayTest(@RequestBody ParamsObj paramsObj){
        return paramsObj.getArray();
    }
    
    
    @RequestMapping(value="/listTest",method=RequestMethod.POST)
    @ResponseBody
    public List<Integer> listTest(@RequestBody List<Integer> list){
        return list;
    }
    
    
    @RequestMapping(value="/objectListTest",method=RequestMethod.POST)
    @ResponseBody
    public List<Integer> objectListTest(@RequestBody ParamsObj paramsObj){
        return paramsObj.getList();
    }
    
    
    @RequestMapping(value="/mapTest",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,String> mapTest(@RequestBody Map<String,String> map){
        return map;
    }
    
    @RequestMapping(value="/objectMapTest",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,String> objectMapTest(@RequestBody ParamsObj paramsObj){
        return paramsObj.getMap();
    }
    
    
    @RequestMapping(value="/setTest",method=RequestMethod.POST)
    @ResponseBody
    public Set<Integer> setTest(@RequestBody Set<Integer> set){
        return set;
    }
    
    @RequestMapping(value="/objectSetTest",method=RequestMethod.POST)
    @ResponseBody
    public Set<Integer> objectSetTest(@RequestBody ParamsObj paramsObj){
        return paramsObj.getSet();
    }
    
    @RequestMapping(value="/dateTest",method=RequestMethod.POST)
    @ResponseBody
    public DateObj dateTest(@RequestBody DateObj paramsObj){
        return paramsObj;
    }

}
