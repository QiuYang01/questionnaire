package com.example.demo.service;

import com.example.demo.entity.Questionandoption;
import com.example.demo.mapper.QuestionandoptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionandoptionService {
    @Autowired
    QuestionandoptionMapper questionandoptionMapper;
    public Integer addquestionandoption(Questionandoption questionandoption){
        return questionandoptionMapper.addquestionandoption(questionandoption);
    }
}
