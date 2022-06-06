package com.yinsd.test.service.impl;

import com.yinsd.test.entity.Users;
import com.yinsd.test.mapper.UsersMapper;
import com.yinsd.test.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Y-King
 * @since 2022-05-20
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
