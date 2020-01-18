package com.example.demo.controller;

import com.example.demo.entity.Questionandoption;
import com.example.demo.entity.Result;
import com.example.demo.service.QuestionandoptionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Api(tags = "题目接口")
@CrossOrigin
@RestController
@RequestMapping("/questionandoption/")
public class QuestionandoptionController {
    @Autowired
                QuestionandoptionService questionandoptionService;
        @ApiOperation(value = "创建题目",httpMethod ="POST",notes = "")
        @ApiImplicitParams({
                @ApiImplicitParam(name = "questionandopiton_id",value = "题目id"),
                @ApiImplicitParam(name = "questionnaire_id",value = "问卷id",required = true),
                @ApiImplicitParam(name="questionandoption_number",value = "题目编号",required = true),
                @ApiImplicitParam(name="questionandoption_content",value = "题目内容",required = true),
                @ApiImplicitParam(name="option1",value = "题目选项1",required = true),
                @ApiImplicitParam(name="option2",value = "题目选项2",required = true),
                @ApiImplicitParam(name="option3",value = "题目选项3",required = true),
                @ApiImplicitParam(name="option4",value = "题目选项4",required = true),
                @ApiImplicitParam(name = "option1_nun",value = "题目选项1的人数"),
                @ApiImplicitParam(name = "option2_nun",value = "题目选项2的人数"),
                @ApiImplicitParam(name = "option3_nun",value = "题目选项3的人数"),
                @ApiImplicitParam(name = "option4_nun",value = "题目选项4的人数")
        })
        @PostMapping("add")
        public Result addquestionandoption(@RequestBody Questionandoption questionandoption){
            return Result.ok("创建成功！",questionandoptionService.addquestionandoption(questionandoption));
    }

}
