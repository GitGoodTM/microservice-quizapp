package com.sooraj.learning.microservicequizapp.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuestionResponse {
    private Integer questionId;
    private String response;
}
