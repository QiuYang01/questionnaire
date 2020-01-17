package com.example.demo.controller;
import com.example.demo.entity.Questionanswer;
import com.example.demo.entity.Questionnaire;
import com.example.demo.entity.Result;
import com.example.demo.service.QuestionanswerService;
import com.example.demo.service.QuestionnaireService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Api(tags = "问卷接口")
@CrossOrigin
@RestController
@RequestMapping("/questionnaire/")
public class QuestionnaireController {
    @Autowired
    QuestionnaireService questionnaireService;
    @ApiOperation(value = "发布问卷",httpMethod = "POST",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "questionnaire_id",value = "问卷id",required = true),
            @ApiImplicitParam(name = "questionnaire_name",value = "问卷名字",required = true),
            @ApiImplicitParam(name = "questionnaire_date",value = "问卷发布时间",required = true),
            @ApiImplicitParam(name = "userid",value = "用户id",required = true),
            @ApiImplicitParam(name = "is_delete",value = "是否删除问卷",required = true)
    })
    @PostMapping("Insert")
    public Result addquestionnaire(@RequestBody  Questionnaire questionnaire) {
        if (questionnaireService.addquestionnaire(questionnaire) == 1) {
            return Result.ok("问卷发布成功！", "");
        }
        else{
            return  Result.error("问卷发布失败","");
        }
    }
    @ApiOperation(value = "删除问卷",httpMethod = "DELETE",notes = "删除问卷是改变问卷状态，并没有在数据库中删除问卷")
    @ApiImplicitParams({
            @ApiImplicitParam(name ="questionnaire_id",value = "问卷id")
    })
    @DeleteMapping("delete")
    public Result deletequestionnaire(int questionnaire_id){
         if(questionnaireService.deletequestionnaire(questionnaire_id)==1){
             return Result.ok("问卷删除成功！","");
         }
         else{
             return Result.error("问卷删除失败！","");
         }
    }
    @Autowired
    QuestionanswerService questionanswerService;
    @ApiOperation(value = "查看自己发布的问卷",httpMethod = "GET",notes = "根据用户id查看问卷表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id")
    })
    @GetMapping("myquestionnaire")
    public Result selectmyquestionnaire(int id){
        return Result.ok("查询成功！",questionnaireService.selectmyquestionniare(id));
    }
     @ApiOperation(value = "查看所有的问卷",httpMethod = "GET",notes = "查看所有问卷详细信息")
     @GetMapping("allquestionnaire")
    public Result selectallquestionnaire(){
        return Result.ok("查询成功！",questionnaireService.selectallquestionniare());
     }
     @ApiOperation(value ="提交问卷",httpMethod ="POST",notes = "游客提交问卷,前端传入数组list，后端将数据批量插入数据库,答案id自增")
     @ApiImplicitParams({
             @ApiImplicitParam(name ="answer_id",value = "答案id(由后端自动生成)"),
             @ApiImplicitParam(name ="user_ip",value = "用户ip",required = true),
             @ApiImplicitParam(name="questionnare_id",value = "问卷id",required = true),
             @ApiImplicitParam(name="questionandoption_id",value = "题目id",required = true),
             @ApiImplicitParam(name="answer",value = "题目答案",required = true)
     })
     @PostMapping("submit")
    public Result submitQuestionnaire(@RequestBody @RequestParam(value = "questionanswer",required = false) List<Questionanswer> questionanswer){
        if(questionanswerService.addquestionanswer(questionanswer)!=0){
            return Result.ok("提交成功！","");
            }
        else{
            return Result.error("提交失败！");
        }
     }


}
