package com.dark.service.impl;

import com.dark.model.User;
import com.dark.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述: TODO
 *
 * @author : <a href="mailto:xueteng@yinli56.com ">teng.xue</a>
 * @version : Ver 1.0
 * @date : 2018/1/29
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Transactional
    @Override
    public void save(User user) {

    }
}
