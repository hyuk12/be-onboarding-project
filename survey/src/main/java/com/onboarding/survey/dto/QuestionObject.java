package com.onboarding.survey.dto;

import com.onboarding.survey.entity.Question;
import com.onboarding.survey.entity.Survey;
import com.onboarding.survey.enums.Operation;
import com.onboarding.survey.enums.QuestionType;
import java.util.List;
import lombok.Builder;

@Builder
public record QuestionObject(
    Long id,
    String title,
    String description,
    QuestionType type,
    Operation operation,
    boolean isRequired,
    Integer orderIndex,
    List<String> choices
) {
  public Question of(Survey survey) {
    return Question.builder()
        .title(title)
        .description(description)
        .type(type)
        .isRequired(isRequired)
        .orderIndex(orderIndex)
        .survey(survey)
        .choices(choices)
        .build();
  }
}
