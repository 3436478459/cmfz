package com.baizhi.zwn.service;

import com.baizhi.zwn.entity.User;
import com.baizhi.zwn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> queryAll() {
        List<User> list=userMapper.selectAll();
        return list;
    }
}
