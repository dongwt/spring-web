package com.dongwt.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * Function: 字段操作
 *
 * @author   dongwt
 * @Date	 2016年9月28日		下午2:57:08
 *
 * @see
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OperateField {
    
    boolean isExclude() default false;//是否排除
    
    String prefix() default  "";//默认前缀
   
    String suffix() default "";//默认后缀
    
    String name() default "";//名称
    
    String datePattern() default "yyyy-MM-dd hh:mm:ss";//日期格式
    
    String trueValue() default "是";//boolean true
    
    String falseValue() default "否";//boolean false
}
