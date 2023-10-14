package com.springmvc.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {
		// I can write post construct work right here
		this.upper = age.upper();
		this.lower = age.lower();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
    System.out.println("inside Age Validator");
		if (age == null) {
			return false;
		}

		if (age < lower || age > upper) {

			return false;
		}

		return true;
	}

}
