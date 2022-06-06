package com.yinsd.test.controller;


import com.yinsd.test.entity.Users;
import com.yinsd.test.service.UsersService;
import io.swagger.annotations.ApiOperation;
import lombok.val;
import org.apache.catalina.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Y-King
 * @since 2022-05-20
 */
@RestController
@RequestMapping("/test/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 获取所有的用户数据
     * @return
     */
    @GetMapping
    @ApiOperation(value = "获取所有的用数数据")
    public List getAllUser(){
        List list = usersService.list();
        return list;
    }

    /**
     * 根据id修改用户数据
     * @param user
     * @return
     */
    @PutMapping
    @ApiOperation("根据id修改用户数据")
    public String updateUser(@RequestBody Users user){
        boolean b = usersService.updateById(user);
        return "code = 20000";
    }


    /**
     *
     * @param
     * @return
     */
    @PostMapping
    @ApiOperation("添加用户数据")
    public boolean addUser(@RequestBody Users users){
        boolean save = usersService.save(users);
        boolean result = false;
        if (save == true){
            result = true;
        }
        return result;
    }

    /**
     * 根据id删除用户数据次
     * @param id
     * @return
     */
    @DeleteMapping
    @ApiOperation("根据id删除用户数据")
    public String remUserById(@PathVariable("id") String id) {
        usersService.removeById(id);
        return "code = 20000";
    }

    @Test
    public static void main(String[] args){
        String str = "A-这是一个内容";
        //System.out.println(str.length());
        char[] chars = str.toCharArray();
        for (char strr:chars) {
            System.out.println(strr);
        }
        char c = str.charAt(0);
        System.out.println(c);


        //System.out.println(str.length());
    }

}

