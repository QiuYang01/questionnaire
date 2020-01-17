package com.example.demo.service;

import com.example.demo.entity.Questionanswer;
import com.example.demo.mapper.QuestionanswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionanswerService {

    @Autowired
    QuestionanswerMapper questionanswerMapper;
    public Integer addquestionanswer(List<Questionanswer> questionanswer){
            return questionanswerMapper.addquestionanswer(questionanswer);

    }
}
