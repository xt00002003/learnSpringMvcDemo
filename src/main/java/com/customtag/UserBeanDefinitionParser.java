package com.customtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 描述: 解析XSD文件中的定义和组件定义
 *
 * @author: dark.xue
 * @version: 1.0
 * @date: 2018/2/24
 **/
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String userName=element.getAttribute("userName");
        String email=element.getAttribute("email");
        if(StringUtils.hasText(userName)){
            builder.addPropertyValue("userName",userName);
        }
        if (StringUtils.hasText(email)){
            builder.addPropertyValue("email",email);
        }
    }
}
