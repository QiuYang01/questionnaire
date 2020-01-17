package com.example.demo.mapper;

import com.example.demo.entity.Questionandoption;
import com.example.demo.entity.Questionanswer;
import com.example.demo.entity.Questionnaire;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionandoptionMapper {
    @Insert("INSERT INTO questionandoption(questionnaire_id,question_number,question_content,option1,option2,option3,option4)" +
            "VALUES(#{questionnaire_id},#{questionnaire_number},#{question_content},#{option1},#{option2},#{option3},#{option4}) ")
    Integer addquestionandoption(Questionandoption questionandoption);
    

}
