package org.ncu.Calculator;

public class MultiplicationService implements MathService {

	@Override
	public int Operate(int x, int y) {
		// TODO Auto-generated method stub
		int product=x*y;
		return product;
	}

	@Override
	public String error() {
		// TODO Auto-generated method stub
		return null;
	}

}
