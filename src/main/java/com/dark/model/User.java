package com.dark.model;

/**
 * 描述: 用户类
 *
 * @author : <a href="mailto:xueteng@yinli56.com ">teng.xue</a>
 * @version : Ver 1.0
 * @date : 2018/1/29
 */
public class User {

    private String userNamne;
    private String password;

    public String getUserNamne() {
        return userNamne;
    }

    public void setUserNamne(String userNamne) {
        this.userNamne = userNamne;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNamne='" + userNamne + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
