package com.dongwt.spring.test;

import java.util.ArrayList;
import java.util.Date;
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

    private List<ExcelObj> dataList;

    @Before
    public void before() {
        dataList = new ArrayList<ExcelObj>();
        dataList.add(new ExcelObj("aaa", 12, true, "110-aaa", "上海-aaa", new Date()));
        dataList.add(new ExcelObj("bbb", 12, true, "110-bbb", "上海-bbb", new Date()));
        dataList.add(new ExcelObj("ccc", 12, false, "110-ccc", "上海-ccc", new Date()));
        dataList.add(new ExcelObj("ddd", 12, true, "110-ddd", "上海-ddd", new Date()));
        dataList.add(new ExcelObj("eee", 12, true, "110-eee", "上海-eee", new Date()));
    }

    @Test
    public void exportFile() {
        try {
            ExcelUtils.exportFile("C:/excel", ExcelObj.class, dataList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void download() {
        MockHttpServletResponse response = new MockHttpServletResponse();
        try {
            ExcelUtils.download(response, "excel", ExcelObj.class, dataList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
