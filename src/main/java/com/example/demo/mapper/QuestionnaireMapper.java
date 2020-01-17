package com.example.demo.mapper;

import com.example.demo.entity.Questionnaire;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionnaireMapper {
        @Insert("INSERT INTO questionnaire(questionnaire_id,questionnaire_name,questionnaire_date,userid) VALUES(#{questionnaire_id},#{questionnaire_name}) ")
        Integer addquestionnaire(Questionnaire questionnaire);
        @Update("UPDATE questionnaire SET is_delete= 1 where questionnaire_id=#{questionnaire_id}")
        Integer deletequestionnaire(int  questionnaire_id);
        @Select("SELECT questionnaire_id,questionnaire_name,questionnaire_date FROM questionnaire,userid WHERE  userid=#{id} ")
        List<Questionnaire> selectmyquestionnaire(int id);
        @Select("SELECT questionnaire_id,questionnaire_name,questionnaire_date,userid FROM questionnaire")
        List<Questionnaire> selectallquestionnaire();
}
