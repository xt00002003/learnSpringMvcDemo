package com.dark.load.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 描述: 从xml加载类开始学起
 *
 * @author: dark.xue
 * @version: 1.0
 * @date: 2018/2/5
 **/
public class LeanXmlBeanFactory {

    public static void main(String[] args){
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("springmvc-servlet.xml"));
    }
}
