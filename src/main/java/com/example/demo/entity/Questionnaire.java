package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javafx.scene.chart.PieChart;

import java.util.Date;

/**
 * 问卷实体
 */
@ApiModel(value = "问卷",description = "问卷详细信息")
public class Questionnaire {
    @ApiModelProperty(value = "问卷id")
    private int questionnaire_id;
    @ApiModelProperty(value = "问卷名称")
    private String questionnaire_name;
    @ApiModelProperty(value = "问卷发布的时间")
    private Date questionnaire_date;
    @ApiModelProperty(value = "用户id")
    private  int userid;
    @ApiModelProperty(value = "是否删除问卷（0不删1删除，默认为0)")
    private  boolean is_delete;

    public int getQuestionnaire_id() {
        return questionnaire_id;
    }

    public void setQuestionnaire_id(int questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    public String getQuestionnaire_name() {
        return questionnaire_name;
    }

    public void setQuestionnaire_name(String questionnaire_name) {
        this.questionnaire_name = questionnaire_name;
    }

    public Date getQuestionnaire_date() {
        return questionnaire_date;
    }

    public void setQuestionnaire_date(Date questionnaire_date) {
        this.questionnaire_date = questionnaire_date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }
}
