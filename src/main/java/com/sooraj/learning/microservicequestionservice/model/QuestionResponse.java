package com.sooraj.learning.microservicequestionservice.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuestionResponse {
    private Integer questionId;
    private String response;
}
