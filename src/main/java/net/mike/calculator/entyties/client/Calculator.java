package net.mike.calculator.entyties.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.mike.calculator.service.invoker.ControlUnit;
import net.mike.calculator.entyties.receiver.ArithmeticUnit;
import net.mike.calculator.logic.command.Command;
import net.mike.calculator.logic.command.concretecommand.AdditionCommand;
import net.mike.calculator.logic.command.concretecommand.DivisionCommand;
import net.mike.calculator.logic.command.concretecommand.MultiplicationCommand;
import net.mike.calculator.logic.command.concretecommand.SubstractionCommand;

public class Calculator {
	
	ArithmeticUnit arithmeticUnit;
	ControlUnit controlUnit;
	int result;
	
	public Calculator() {
		super();
		arithmeticUnit = new ArithmeticUnit();
		controlUnit = new ControlUnit();
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int rez) {
		this.result = rez;
	}
	
	public int run(Command command) {
		controlUnit.setCommand(command);
		controlUnit.ExecuteCommand();
		return arithmeticUnit.rez;
	}
	
	public int add(int a, int b) {
		
		return run(new AdditionCommand(arithmeticUnit, a, b));
	}
	
	public int sub(int a, int b) {
		
		return run(new SubstractionCommand(arithmeticUnit, a, b));
	}
	public int mul(int a, int b) {
		
		return run(new MultiplicationCommand(arithmeticUnit, a, b));
	}
	public int div(int a, int b) {
		
		return run(new DivisionCommand(arithmeticUnit, a, b));
	}
	
}
