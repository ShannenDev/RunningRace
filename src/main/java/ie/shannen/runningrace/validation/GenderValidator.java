package ie.shannen.runningrace.validation;

import ie.shannen.runningrace.common.Gender;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<ValidGender, String> {
    @Override
    public void initialize(ValidGender constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String gender, ConstraintValidatorContext constraintValidatorContext) {
        try {
            Gender.valueOf(gender);
        } catch (RuntimeException exception) {
            return false;
        }
        return true;
    }
}
