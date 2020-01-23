package net.mike.calculator.entyties.client;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.command.concretecommand.AdditionCommand;
import net.mike.calculator.service.command.concretecommand.DivisionCommand;
import net.mike.calculator.service.command.concretecommand.MultiplicationCommand;
import net.mike.calculator.service.command.concretecommand.SubstractionCommand;
import net.mike.calculator.service.invoker.ControlUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ConverterUnit;
import net.mike.calculator.service.receiver.Unit;

public class Calculator {
	private ControlUnit controlUnit = new ControlUnit();
	private String result;
	private Unit converterUnit = new ConverterUnit();
	private Unit arithmeticUnit = new ArithmeticUnit();
	
	public Calculator() {
		super();
	    this.setConverterUnit(converterUnit);
	    this.setArithmeticUnit(arithmeticUnit);
	    this.setControlUnit(controlUnit);
	}
	public Unit getConverterUnit() {
		return converterUnit;
	}

	public void setConverterUnit(Unit converterUnit) {
		this.converterUnit = converterUnit;
	}

	public Unit getArithmeticUnit() {
		return arithmeticUnit;
	}

	public void setArithmeticUnit(Unit arithmeticUnit) {
		this.arithmeticUnit = arithmeticUnit;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public ControlUnit getControlUnit() {
		return controlUnit;
	}

	public void setControlUnit(ControlUnit controlUnit) {
		this.controlUnit = controlUnit;
	}

	
	
	public String run(Command command) {
		controlUnit.setCommand(command);
		
		return controlUnit.ExecuteCommand();
	}
	
	public void add(String a, String b) {
		run(new AdditionCommand(this.getArithmeticUnit(), a, b));
	}
	
	public void sub(String a, String b) {
		
		run(new SubstractionCommand(this.getArithmeticUnit(), a, b));
	}
	
	public void mul(String a, String b) {
		
		run(new MultiplicationCommand(this.getArithmeticUnit(), a, b));
	}
	
	public String div(String a, String b) {
		this.setArithmeticUnit(arithmeticUnit);
		 return run(new DivisionCommand(this.getArithmeticUnit(), a, b));
	}
	
}
