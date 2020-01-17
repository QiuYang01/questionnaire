package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "题目",description = "题目详细信息")
public class Questionandoption {
    @ApiModelProperty(value = "题目id")
    private Integer questionandoption_id;
    @ApiModelProperty(value = "问卷id")
    private Integer questionnaire_id;
    @ApiModelProperty(value = "题目编号")
    private  Integer question_number;
    @ApiModelProperty(value = "题目内容")
    private  String  question_content;
    @ApiModelProperty(value = "题目选项1")
    private  String option1;
    @ApiModelProperty(value = "题目选项2")
    private  String option2;
    @ApiModelProperty(value = "题目选项3")
    private  String option3;
    @ApiModelProperty(value = "题目选项4")
    private  String option4;
    @ApiModelProperty(value = "题目选项1的人数")
    private Integer option1_nun;
    @ApiModelProperty(value = "题目选项2的人数")
    private Integer option2_nun;
    @ApiModelProperty(value = "题目选项3的人数")
    private Integer option3_nun;
    @ApiModelProperty(value = "题目选项4的人数")
    private Integer option4_nun;
    public Integer getId() {
        return questionandoption_id;
    }

    public void setId(Integer questionandoption_id) {
        this.questionandoption_id = questionandoption_id;
    }

    public Integer getQuestionnaire_id() {
        return questionnaire_id;
    }
    public void setQuestionnaire_id(Integer questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    public Integer getQuestion_number() {
        return question_number;
    }

    public void setQuestion_number(Integer question_number) {
        this.question_number = question_number;
    }

    public String getQuestion_content() {
        return question_content;
    }

    public void setQuestion_content(String question_content) {
        this.question_content = question_content;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public Integer getOption1_nun() {
        return option1_nun;
    }

    public void setOption1_nun(Integer option1_nun) {
        this.option1_nun = option1_nun;
    }

    public Integer getOption2_nun() {
        return option2_nun;
    }

    public void setOption2_nun(Integer option2_nun) {
        this.option2_nun = option2_nun;
    }

    public Integer getOption3_nun() {
        return option3_nun;
    }

    public void setOption3_nun(Integer option3_nun) {
        this.option3_nun = option3_nun;
    }

    public Integer getOption4_nun() {
        return option4_nun;
    }

    public void setOption4_nun(Integer option4_nun) {
        this.option4_nun = option4_nun;
    }
}
