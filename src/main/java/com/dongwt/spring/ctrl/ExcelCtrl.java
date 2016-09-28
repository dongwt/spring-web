package com.dongwt.spring.ctrl;

import java.util.ArrayList;
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
        
        String[] titles = new String[]{"用户名","年龄","性别","手机号","地址"};
        List<ExcelObj> dataList = new ArrayList<ExcelObj>();
        dataList.add(new ExcelObj("aaa", 12, "男", "110-aaa", "上海-aaa"));
        dataList.add(new ExcelObj("bbb", 12, "男", "110-bbb", "上海-bbb"));
        dataList.add(new ExcelObj("ccc", 12, "男", "110-ccc", "上海-ccc"));
        dataList.add(new ExcelObj("ddd", 12, "男", "110-ddd", "上海-ddd"));
        dataList.add(new ExcelObj("eee", 12, "男", "110-eee", "上海-eee"));
        
        try {
            ExcelUtils.download(response, "excel", ExcelObj.class, titles, dataList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
