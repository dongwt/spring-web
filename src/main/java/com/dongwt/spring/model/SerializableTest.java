package com.dongwt.spring.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

public class SerializableTest {
    
    private String path = "C:/SerializableObj";
    
    @Test
    public void serializable() throws Exception{
        ObjectOutputStream  os = new ObjectOutputStream(new FileOutputStream(path));
        SerializableObj obj = new SerializableObj();
        obj.setIntParams(100);
        os.writeObject(obj);
        os.flush();
        os.close();
    }
    
    @Test
    public void deserialize()  throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
        SerializableObj obj = (SerializableObj) in.readObject();
        in.close();
        System.out.println(JSONObject.toJSONString(obj));
    }

}
