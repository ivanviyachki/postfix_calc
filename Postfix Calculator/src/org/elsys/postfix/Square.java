package org.elsys.postfix;

public class Square extends UnaryOperation {

	public Square(Calculator calculator) {
		super("**", calculator);
	}

	@Override
	public double execute(double value) {
		return value * value;
	}

}
