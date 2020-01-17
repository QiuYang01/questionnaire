package com.example.demo.service;

import com.example.demo.entity.Questionnaire;
import com.example.demo.entity.User;
import com.example.demo.mapper.QuestionnaireMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QuestionnaireService {
    @Autowired
    QuestionnaireMapper questionnaireMapper;
    public  Integer addquestionnaire(Questionnaire questionnaire){
        questionnaire.setQuestionnaire_date(new Date());
        return questionnaireMapper.addquestionnaire(questionnaire);
    }
    public Integer deletequestionnaire(int questionnaire_id){
        return questionnaireMapper.deletequestionnaire(questionnaire_id);
    }
    public List<Questionnaire> selectmyquestionniare(int id){
        return questionnaireMapper.selectmyquestionnaire(id);
    }
    public List<Questionnaire> selectallquestionniare(){
        return questionnaireMapper.selectallquestionnaire();
    }

}
