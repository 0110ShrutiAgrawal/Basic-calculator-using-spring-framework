package org.ncu.Calculator;

public class SubtractionService implements MathService {

	@Override
	public int Operate(int x, int y) {
		// TODO Auto-generated method stub
		int difference=x-y;
		return difference;
	}

	@Override
	public String error() {
		// TODO Auto-generated method stub
		return null;
	}

}
