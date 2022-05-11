package org.ncu.Calculator;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the operator");
		String op = input.next();
		System.out.println("Enter the value of variable a");
		int a = input.nextInt();
		System.out.println("Enter the value of variable b");
		int b = input.nextInt();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Calculator obj = context.getBean(op, Calculator.class);
		System.out.println("The answer is:-");
		obj.compute(op, a, b);

	}
}
