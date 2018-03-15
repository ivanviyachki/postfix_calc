package org.elsys.postfix;

public class Duplicate extends AbstractOperation {

	public Duplicate(Calculator calculator) {
		super("dup", calculator);
	}

	@Override
	public double execute() {
		double value = getCalculator().lastValue();
		return value;
	}

}
