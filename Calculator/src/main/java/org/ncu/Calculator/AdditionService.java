package org.ncu.Calculator;

;

public class AdditionService implements MathService {

	@Override
	public int Operate(int x, int y) {
		// TODO Auto-generated method stub
		int sum = x + y;
		return sum;
	}

	@Override
	public String error() {
		// TODO Auto-generated method stub
		return null;
	}

}
