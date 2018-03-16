package com.mmall.common;

/**
 * Created by LEI on 2018/3/13.
 * 常量类
 */
public class Const {
    public static final String CURRENT_USER = "currentuser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";


    public interface Role{
        int ROLE_CUSTOME = 0;  //普通用户
        int ROLE_ADMIN =1;     //管理员


    }
}
