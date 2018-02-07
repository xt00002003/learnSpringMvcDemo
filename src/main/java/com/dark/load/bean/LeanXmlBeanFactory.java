package com.dark.load.bean;

import com.dark.service.HelloService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * 描述: 从xml加载类开始学起
 *
 * @author: dark.xue
 * @version: 1.0
 * @date: 2018/2/5
 **/
public class LeanXmlBeanFactory {

    public static void main(String[] args)  throws Exception{
        Resource resource=new ClassPathResource("springmvc-servlet.xml");
        InputStream inputStream=resource.getInputStream();
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("springmvc-servlet.xml"));
        HelloService helloService=(HelloService)bf.getBean("helloService");

    }
}
