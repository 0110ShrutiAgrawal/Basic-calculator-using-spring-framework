package org.ncu.Calculator;

public class Calculator {
	MathService obj;
	public Calculator(MathService obj)
	{
		this.obj=obj;
	}
	
	public void compute(String a,int b,int c)
	{
		System.out.println(" "+obj.Operate(b, c));
	}
	}

