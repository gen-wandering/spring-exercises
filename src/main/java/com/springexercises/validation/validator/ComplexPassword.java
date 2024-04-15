package com.springexercises.validation.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ComplexPasswordValidator.class)
public @interface ComplexPassword {

    String message() default "Пароль должен иметь длину не менее 8 символов и содержать хотя бы одну заглавную букву, одну строчную букву, одну цифру и один специальный символ";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
