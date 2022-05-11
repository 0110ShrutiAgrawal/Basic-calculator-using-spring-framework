package org.ncu.Calculator;

public class NotFound implements MathService {

	@Override
	public int Operate(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String error() {
		// TODO Auto-generated method stub
		return "No such operation found";
	}

}
