package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户接口")
@CrossOrigin
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "用户注册",httpMethod = "POST",notes = "传入账号密码后台生成用户id（自增量）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id（后台自动生成:自增量)"),
            @ApiImplicitParam(name = "user_id",value = "用户账号",required = true),
            @ApiImplicitParam(name = "user_password",value = "用户密码",required = true)
    })
    @PostMapping("register")
    public Result userregister(@RequestBody User user ) {
        if (user.getUser_id()==0) {
            return Result.error("请输入账号！", "");
        }
        if (user.getUser_password() == null) {
            return Result.error("请输入密码！", "");
        }
        if (userService.userRegister(user) == 1) {
            return Result.ok("注册成功");
        } else {
            return Result.error("账号已存在，注册失败！");
        }
    }
    @ApiOperation(value ="用户登录",httpMethod = "GET",notes = "根据前端传入账号密码进行匹配")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id（后台自动生成:自增量)"),
            @ApiImplicitParam(name = "user_id",value = "用户账号",required = true),
            @ApiImplicitParam(name = "user_password",value = "用户密码",required = true)
    })
    @GetMapping("login")
    public Result userlogin(int user_id,String user_password){
        if(userService.userListlogin(user_id,user_password)!=null){
            return Result.ok("登录成功！",userService.userListlogin(user_id,user_password));
        }
        else{
            return Result.error("账号或密码错误，登录失败！","");
        }
    }
}
