package com.example.demo.mapper;

import com.example.demo.entity.Questionanswer;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionanswerMapper {

    @Insert({
            "<script>",
            "insert into questionanswer(user_ip,questionnaire_id,questionandoption_id,answer) values ",
            "<foreach collection='list' item='answer_id' index='index' separator=','>",
            "(#{item.user_ip}, #{item.questionnaire_id}, #{item.questionandoption_id},#{item.answer})",
            "</foreach>",
            "</script>"
    })
    int addquestionanswer(@Param(value="questionanswer") List<Questionanswer> questionanswer);
}
