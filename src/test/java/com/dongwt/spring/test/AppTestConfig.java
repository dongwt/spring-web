package com.dongwt.spring.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = { "classpath*:dispatcher-servlet.xml"})
public class AppTestConfig {

}
