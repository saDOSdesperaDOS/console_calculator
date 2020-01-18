package net.mike.calculator.entyties.client;

import net.mike.calculator.service.invoker.ControlUnit;
import net.mike.calculator.entyties.receiver.ArithmeticUnit;
import net.mike.calculator.logic.command.Command;

public class Calculator {
	
	ArithmeticUnit arithmeticUnit;
	ControlUnit controlUnit;
	
	public Calculator() {
		super();
		this.arithmeticUnit = new ArithmeticUnit();
		this.controlUnit = new ControlUnit();
	}
	public int run(Command command) {
		return 0;
	}
	
	
	
}
