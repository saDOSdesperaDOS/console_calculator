package net.mike.calculator.entyties.client;

import net.mike.calculator.service.invoker.ControlUnit;
import net.mike.calculator.entyties.receiver.ArithmeticUnit;
import net.mike.calculator.logic.command.Command;
import net.mike.calculator.logic.command.concretecommand.AdditionCommand;

public class Calculator {
	
	ArithmeticUnit arithmeticUnit;
	ControlUnit controlUnit;
	int rez;
	
	public Calculator() {
		super();
		this.controlUnit = new ControlUnit();
	}
	public int run(Command command) {
		controlUnit.setCommand(command);
		rez = controlUnit.ExecuteCommand();
		return 0;
	}
	
	public int add(int a, int b) {
		
		return run(new AdditionCommand(arithmeticUnit, 2, 4));
	}
	
	
}
