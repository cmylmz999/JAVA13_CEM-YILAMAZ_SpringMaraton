package com.cem.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class MobilePhoneValidator implements ConstraintValidator<Mobile, String> {
    @Override
    public void initialize(Mobile constraintAnnotation) {};
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        final String PHONE_NUMBER_REGEX = "^\\+90 \\d{3} \\d{3} \\d{2} \\d{2}$";
        final Pattern PHONE_NUMBER_PATTERN = Pattern.compile(PHONE_NUMBER_REGEX);


        return value != null && PHONE_NUMBER_PATTERN.matcher(value).matches();



    }

}
