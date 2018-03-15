package org.elsys.postfix;

public class Plus extends BinaryOperation {

	public Plus(Calculator calculator) {
		super("plus", calculator);
	}

	@Override
	protected double execute(double value1, double value2) {
		return value1 + value2;
	}

}
