package com.dongwt.spring.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

public class XmlUtils {

    /**
     * 
     * 功能描述:获取HttpServletRequest的请求xml
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwentao:   2017年2月8日      新建
     * </pre>
     *
     * @param request
     * @return
     */
    public static String getRequestEntityStr(HttpServletRequest request) {
        StringBuffer sb = new StringBuffer();
        try {
            //获取HTTP请求的输入流
            InputStream is = request.getInputStream();
            //已HTTP请求输入流建立一个BufferedReader对象
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            //读取HTTP请求内容
            String buffer = null;

            while ((buffer = br.readLine()) != null) {
                //在页面中显示读取到的请求参数
                sb.append(buffer);
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    /**
     * 
     * 功能描述:xml转对象
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2017年2月8日      新建
     * </pre>
     *
     * @param clazzs
     * @param xmlStr
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T> T xml2Obj(Class[] clazzs, String xmlStr) {
        XStream xs = new XStream();
        xs.setMode(XStream.NO_REFERENCES);
        xs.processAnnotations(clazzs);
        return (T) xs.fromXML(xmlStr);
    }
    
    
    
    /**
     * 
     * 功能描述:获取HttpServletRequest的请求对象
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2017年2月8日      新建
     * </pre>
     *
     * @param request
     * @param clazzs
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static <T> T  getRequestEntityObj(HttpServletRequest request,Class[] clazzs) {
        String requestStr = getRequestEntityStr(request);
        return xml2Obj(clazzs, requestStr);
    }
    

    /**
     * 
     * 功能描述:对象转xml
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2017年2月8日      新建
     * </pre>
     *
     * @param clazzs
     * @param obj
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static  String obj2Xml(Class[] clazzs, Object obj) {
        XStream xs = new XStream();
        xs.setMode(XStream.NO_REFERENCES);
        xs.processAnnotations(clazzs);
        return xs.toXML(obj);
    }
    
    
    /**
     * 
     * 功能描述:响应xml
     *
     * <pre>
     * Modify Reason:(修改原因,不需覆盖，直接追加.)
     *     dongwt:   2017年2月8日      新建
     * </pre>
     *
     * @param clazzs
     * @param t
     * @param response
     */
    @SuppressWarnings("rawtypes")
    public static  void responseXml(Class[] clazzs, Object obj,HttpServletResponse response){
        XStream xs = new XStream();
        xs.setMode(XStream.NO_REFERENCES);
        xs.processAnnotations(clazzs);
        try {
            xs.toXML(obj,response.getOutputStream());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
