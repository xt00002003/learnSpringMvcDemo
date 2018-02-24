package com.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 描述: 将组件注册到Spring容器
 *
 * @author: dark.xue
 * @version: 1.0
 * @date: 2018/2/24
 **/
public class MyNamespaceHandler  extends NamespaceHandlerSupport{
    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
