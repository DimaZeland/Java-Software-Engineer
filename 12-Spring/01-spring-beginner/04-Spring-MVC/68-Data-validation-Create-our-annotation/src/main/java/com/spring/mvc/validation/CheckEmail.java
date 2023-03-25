package com.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)                              //Область, где будет применяться наша созданная аннотация
@Retention(RetentionPolicy.RUNTIME)
//информация о нашей информации должна выполняться вплоть до запуска кода
@Constraint(validatedBy = CheckEmailValidator.class)    //именно данный класс будет обрабатывать данную аннотацию
public @interface CheckEmail {
    public String value() default "xyz.com";

    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
