package com.onboarding.survey.dto;

import com.onboarding.survey.entity.Question;
import com.onboarding.survey.entity.Survey;
import java.util.List;
import lombok.Builder;

@Builder
public record SurveyObject(
    String surveyName,
    String surveyDescription,
    List<QuestionObject> questions
) {
  public Survey of(List<Question> questions) {
    return Survey.builder()
        .name(surveyName)
        .description(surveyDescription)
        .questions(questions)
        .build();
  }
}
