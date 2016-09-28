package com.dongwt.spring.ctrl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dongwt.spring.model.ExcelObj;
import com.dongwt.spring.utils.ExcelUtils;

@Controller
@RequestMapping("/excel")
public class ExcelCtrl {
    
    
    @RequestMapping("/download")
    public void download(HttpServletResponse response){
        
        List<ExcelObj> dataList = new ArrayList<ExcelObj>();
        dataList.add(new ExcelObj("aaa", 12, true, "110-aaa", "上海-aaa",new Date()));
        dataList.add(new ExcelObj("bbb", 12, true, "110-bbb", "上海-bbb",new Date()));
        dataList.add(new ExcelObj("ccc", 12, false, "110-ccc", "上海-ccc",new Date()));
        dataList.add(new ExcelObj("ddd", 12, true, "110-ddd", "上海-ddd",new Date()));
        dataList.add(new ExcelObj("eee", 12, true, "110-eee", "上海-eee",new Date()));
        
        try {
            ExcelUtils.download(response, "excel", ExcelObj.class,  dataList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
