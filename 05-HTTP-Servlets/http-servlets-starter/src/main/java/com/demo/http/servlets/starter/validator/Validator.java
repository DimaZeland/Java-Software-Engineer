package com.demo.http.servlets.starter.validator;

public interface Validator<T> {
    ValidationResult isValid(T object);
}
