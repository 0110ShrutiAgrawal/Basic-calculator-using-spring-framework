package org.ncu.Calculator;

public class DivisionService implements MathService {
	
	@Override
	public int Operate(int x, int y) {
		// TODO Auto-generated method stub
		int result=x/y;
		return result;
	}

	@Override
	public String error() {
		// TODO Auto-generated method stub
		return null;
	}

}
