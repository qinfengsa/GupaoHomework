package com.qinfengsa.pattern.adapter.service;

import com.qinfengsa.pattern.adapter.entity.ResultMsg;
import com.qinfengsa.pattern.adapter.entity.User;

/**
 * @author: qinfengsa
 * @date: 2019/3/31 01:08
 */
public class LoginService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new User());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){

        return new ResultMsg(200,"登录成功",new User());
    }
}
