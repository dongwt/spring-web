package com.dongwt.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dongwt.spring.model.ExcelObj;
import com.dongwt.spring.utils.ExcelUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppTestConfig.class)
public class ExportExcelTest {
    
    private String[] titles;
    
    private List<ExcelObj> dataList;
    
    @Before
    public void before(){
        titles = new String[]{"用户名","年龄","性别","手机号","地址"};
        dataList = new ArrayList<ExcelObj>();
        dataList.add(new ExcelObj("aaa", 12, "男", "110-aaa", "上海-aaa"));
        dataList.add(new ExcelObj("bbb", 12, "男", "110-bbb", "上海-bbb"));
        dataList.add(new ExcelObj("ccc", 12, "男", "110-ccc", "上海-ccc"));
        dataList.add(new ExcelObj("ddd", 12, "男", "110-ddd", "上海-ddd"));
        dataList.add(new ExcelObj("eee", 12, "男", "110-eee", "上海-eee"));
    }
    
    
    @Test
    public void exportFile(){
        try {
            ExcelUtils.exportFile("C:/excel", ExcelObj.class, titles, dataList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    @Test
    public void download(){
        MockHttpServletResponse response = new MockHttpServletResponse();
        try {
            ExcelUtils.download(response, "excel", ExcelObj.class, titles, dataList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
