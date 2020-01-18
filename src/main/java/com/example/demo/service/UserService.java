package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
    UserMapper userMapper;
public Integer userRegister(User user){
    return userMapper.userRegister(user);

}
    public List<User> userListlogin(int user_id,String user_password){
        return userMapper.userLogin(user_id,user_password);
    }
}
