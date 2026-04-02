package com.sooraj.learning.microservicequestionservice.controller;

import com.sooraj.learning.microservicequestionservice.model.Question;
import com.sooraj.learning.microservicequestionservice.model.QuestionResponse;
import com.sooraj.learning.microservicequestionservice.model.QuestionWrapper;
import com.sooraj.learning.microservicequestionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("postNewQuestion")
    public ResponseEntity<String> postNewQuestion(@RequestBody Question question){
        return questionService.postNewQuestion(question);
    }

    // generate
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category, @RequestParam Integer numberOfQuestions){
        return questionService.getQuestionsForQuiz(category, numberOfQuestions);
    }

    // getQuestions (questionId)
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
        return questionService.getQuestionsFromId(questionIds);
    }

    // getScore
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<QuestionResponse> responses){
        return questionService.getScore(responses);
    }
}
