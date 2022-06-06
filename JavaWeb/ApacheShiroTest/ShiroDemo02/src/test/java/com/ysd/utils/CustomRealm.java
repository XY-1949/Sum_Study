package com.ysd;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/29 16:09
 */

/**
 * 自定义  Realm  文件，
 */
public class CustomRealm extends AuthorizingRealm {

    //创建一个初始容量为16的HashMap的集合
    Map<String,String> userMap = new HashMap<>(16);
    {
        userMap.put("Yinsd","9981");
        super.setName("customRealm");
    }

    /**
     * 用来授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }


    /**
     * 用来认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1，从主体中传过来的认证信息token中，获取用户名数据
        String userName = (String) token.getPrincipal();

        //2，通过用户名到数据库中获取凭证
        String password = getPasswordByUserName(userName);

        if (password == null){
            return null;
        }
        //创建  SimpleAuthenticationInfo  的对象，对用户信息进行验证。
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo("Yinsd",password,"customRealm");

        return authenticationInfo;
    }

    //这里模拟数据库中去获取查询凭证
    private String getPasswordByUserName(String userName) {

        return userMap.get(userName);
    }
}
