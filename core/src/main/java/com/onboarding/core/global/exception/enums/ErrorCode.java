package com.onboarding.core.global.exception.enums;

public enum ErrorCode {
  ENTITY_NOT_FOUND("Entity not found"),
  ENTITY_ALREADY_EXISTS("Entity already exists"),
  INVALID_INPUT_VALUE("Invalid input value"),
  METHOD_NOT_ALLOWED("Method not allowed"),
  INTERNAL_SERVER_ERROR("Internal server error"),
  INVALID_TYPE_VALUE("Invalid type value"),
  HANDLE_ACCESS_DENIED("Access is denied"),
  INVALID__REQUEST("Invalid request");

  private final String message;

  ErrorCode(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
