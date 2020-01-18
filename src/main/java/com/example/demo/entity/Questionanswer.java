package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 问卷答案实体
 */
@ApiModel(value = "问卷答案",description = "问卷答案详细信息")
public class Questionanswer {
    @ApiModelProperty(value = "答案id")
    private Integer answer_id;
    @ApiModelProperty(value = "参与调查问卷的用户的ip")
    private  Integer user_ip;
    @ApiModelProperty(value = "问卷id")
    private  Integer questionnaire_id;
    @ApiModelProperty(value = "题目id")
    private  Integer questionandoption_id;
    @ApiModelProperty(value = "题目答案")
    private  String answer;

    public Integer getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(Integer user_ip) {
        this.user_ip = user_ip;
    }

    public Integer getQuestionnaire_id() {
        return questionnaire_id;
    }

    public void setQuestionnaire_id(Integer questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    public Integer getQuestionandoption_id() {
        return questionandoption_id;
    }

    public void setQuestionandoption_id(Integer questionandoption_id) {
        this.questionandoption_id = questionandoption_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
