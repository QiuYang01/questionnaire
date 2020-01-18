package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Insert("INSERT INTO User(user_id,user_password) VALUES(#{user_id},#{user_password}) ")
    Integer userRegister(User user);
    @Select({"SELECT  id,user_id,user_password FROM User WHERE user_id=#{user_id} AND user_password=#{user_password}"})
    List<User> userLogin(int user_id,String user_password);
}

