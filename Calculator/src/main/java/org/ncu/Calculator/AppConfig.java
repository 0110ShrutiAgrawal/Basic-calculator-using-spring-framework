package org.ncu.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	public MathService addition() {
		return new AdditionService();
	}

	public MathService division() {
		return new DivisionService();
	}

	public MathService multi() {
		return new MultiplicationService();
	}

	public MathService Sub() {
		return new SubtractionService();
	}

	@Bean("Addition")
	public Calculator addcalc() {
		return new Calculator(addition());
	}

	@Bean("Division")
	public Calculator divcalc() {
		return new Calculator(division());
	}

	@Bean("Multiplication")
	public Calculator mulcalc() {
		return new Calculator(multi());
	}

	@Bean("Subtraction")
	public Calculator subcalc() {
		return new Calculator(Sub());
	}

	public MathService sub() {
		return new SubtractionService();
	}
}
