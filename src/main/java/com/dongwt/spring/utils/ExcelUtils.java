package com.dongwt.spring.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.dongwt.spring.annotation.OperateField;

/**
 * 
 * Function: excel工具类
 *
 * @author   董纹陶
 * @Date	 2016年9月28日		下午2:25:15
 *
 * @see
 */
public class ExcelUtils {

    /**
     * 
     * 功能描述:创建表头
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2016年9月28日      新建
     * </pre>
     *
     * @param workBook
     * @param titles
     * @return
     */
    public static HSSFWorkbook createHeader(HSSFWorkbook workBook, String[] titles) {
        if (null == titles || titles.length == 0) {
            throw new RuntimeException("titles 不能为空!");
        }
        HSSFSheet sheet = workBook.createSheet();
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < titles.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellType(XSSFCell.CELL_TYPE_STRING);
            cell.setCellValue(titles[i]);
        }
        return workBook;
    }

    /**
     * 
     * 功能描述:创建表体
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2016年9月28日      新建
     * </pre>
     *
     * @param workBook
     * @param clazz
     * @param dataList
     * @return
     * @throws Exception
     */
    public static HSSFWorkbook createBody(HSSFWorkbook workBook, Class<T> clazz, List<T> dataList) throws Exception {
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < dataList.size(); i++) {
            HSSFSheet sheet = workBook.getSheetAt(0);
            HSSFRow row = sheet.createRow(i + 1);
            List<String> values = new ArrayList<String>();
            for (Field field : fields) {
                field.setAccessible(true);
                StringBuffer value = new StringBuffer((String) field.get(dataList.get(i)));
                OperateField operateField = field.getAnnotation(OperateField.class);
                //如果该字段没有被排除
                if (!operateField.isExclude()) {
                    value.append(operateField.prefix(), 0, operateField.prefix().length());
                    value.append(operateField.suffix());
                }
                values.add(value.toString());
            }

            for (int j = 0; j < values.size(); j++) {
                HSSFCell cell = row.createCell(j);
                cell.setCellType(XSSFCell.CELL_TYPE_STRING);
                cell.setCellValue(values.get(j));
            }

        }

        return workBook;
    }

    /**
     * 
     * 功能描述:输出到文件
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2016年9月28日      新建
     * </pre>
     *
     * @param workBook
     * @param fileName
     * @throws IOException
     */
    public static void outputFile(HSSFWorkbook workBook, String fileName) throws IOException {
        FileOutputStream output = new FileOutputStream(fileName + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".xls");
        workBook.write(output);
    }

    /**
     * 
     * 功能描述:输出到web
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2016年9月28日      新建
     * </pre>
     *
     * @param workBook
     * @param response
     * @param fileName
     * @throws IOException
     */
    public static void outputWeb(HSSFWorkbook workBook, HttpServletResponse response, String fileName) throws IOException {
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="
                + new String((fileName + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".xls").getBytes(), "utf-8"));
        OutputStream output = response.getOutputStream();
        workBook.write(output);
    }

    /**
     * 
     * 功能描述:导出到文件
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     Administrator:   2016年9月28日      新建
     * </pre>
     *
     * @param fileName
     * @throws IOException
     */
    public static void exportFile(String fileName) throws IOException {
        HSSFWorkbook workBook = new HSSFWorkbook();
        outputFile(workBook, fileName);
    }

    /**
     * 
     * 功能描述:下载
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2016年9月28日      新建
     * </pre>
     *
     * @param response
     * @param fileName
     * @throws IOException
     */
    public static void download(HttpServletResponse response, String fileName) throws IOException {
        HSSFWorkbook workBook = new HSSFWorkbook();
        outputWeb(workBook, response, fileName);
    }

}
