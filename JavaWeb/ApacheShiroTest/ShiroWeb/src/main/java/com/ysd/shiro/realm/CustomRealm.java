package com.ysd.utils;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md2Hash;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        //userMap.put("Yinsd","9981");
        userMap.put("Yinsd","18d0005254bbbba0584a73a24eeb949b");//将加密后的数据写入Map集合内
        super.setName("customRealm");
    }

    /**
     * 用来授权：用来对登陆的账户拥有的权利进行辨别，然后为用户分配对应的权利
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //通过用户获得角色数据
        String userName = (String) principals.getPrimaryPrincipal();
        /**
         * 从数据库中或缓存中获取权限角色数据
         */
        Set<String> roles = getRolesUserName(userName);
        Set<String> permissions = getPermissionsByUserName(userName);
        SimpleAuthorizationInfo authenticationInfo = new SimpleAuthorizationInfo();
        authenticationInfo.setStringPermissions(permissions);
        authenticationInfo.setRoles(roles);
        return authenticationInfo;
    }

    /**
     * 模拟从数据库中去获取权限
     * @param userName
     * @return
     */
    private Set<String> getPermissionsByUserName(String userName) {
        Set<String> set = new HashSet<>();
        set.add("user:delete");
        set.add("user:add");
        set.add("user:update");
        return set;
    }
    /**
     * 模拟从数据库中获取权限角色数据
     * @param userName
     * @return
     */
    private Set<String> getRolesUserName(String userName) {
        Set<String> set = new HashSet<>();
        //为用户分配角色
        set.add("admin");
        set.add("user");
        return set;
    }

    /**
     * 用来认证:验证用户名和密码
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
        //在验证信息中加入"加盐额提示"，声明加的是啥"盐"。
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("Yinsd"));

        return authenticationInfo;
    }

    //这里模拟数据库中去获取查询凭证
    private String getPasswordByUserName(String userName) {

        return userMap.get(userName);
    }

    @Test
    public void Md5ToPassWord(){
        //9981为原始密码，对其进行加密，后面跟的值是对其进行"加盐"，相当于密码加密字符串后的二次加密
        Md5Hash md5Hash = new Md5Hash("9981","Yinsd");
        System.out.println("md5Hash："+md5Hash);
    }
}
