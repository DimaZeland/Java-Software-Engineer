package com.demo.validator;

public interface Validator<T> {

    ValidationResult validate(T object);
}
