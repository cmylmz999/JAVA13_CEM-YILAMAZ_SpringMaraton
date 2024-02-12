package com.cem.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MobilePhoneValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Mobile {
    String message() default "Invalid mobile phone number. The format should be +90 XXX XXX XX XX";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
