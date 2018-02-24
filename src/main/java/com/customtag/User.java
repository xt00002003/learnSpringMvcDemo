package com.customtag;

/**
 * 描述: 自定义标签的POJO类
 *
 * @author: dark.xue
 * @version: 1.0
 * @date: 2018/2/24
 **/
public class User {

    private String userName;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
