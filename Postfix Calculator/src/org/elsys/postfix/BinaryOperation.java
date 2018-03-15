package org.elsys.postfix;

public abstract class BinaryOperation extends AbstractOperation {

	public BinaryOperation(String symbol, Calculator calculator) {
		super(symbol, calculator);
	}

	@Override
	public double execute() {
		double value1 = getCalculator().popValue();
		double value2 = getCalculator().popValue();
		
		return execute(value1, value2);
	}

	protected abstract double execute(double value1, double value2);
}
