package com.qinfengsa.pattern.adapter.refactor;

import com.qinfengsa.pattern.adapter.entity.ResultMsg;
import com.qinfengsa.pattern.adapter.service.LoginService;

/**
 * 继承LoginService达到适配的目的
 * @author: qinfengsa
 * @date: 2019/3/31 20:37
 */
public class LoginForThirdService extends LoginService {

    // 默认密码
    static String DEFULT_PWD_QQ = "123456";

    /**
     * QQ登录方法
     * @param openId
     * @return
     */
    public ResultMsg loginForQQ(String openId) {
        super.regist(openId,DEFULT_PWD_QQ);

        return super.login(openId,DEFULT_PWD_QQ);

    }
}
