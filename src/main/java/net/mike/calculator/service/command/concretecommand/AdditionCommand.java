package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.Unit;

//Concrete command
public class AdditionCommand extends Command {
	
	private Unit unit;//receiver
	private int operand1, operand2;

	
	public AdditionCommand(Unit unit, int a, int b) {
		this.unit =  unit;
		  this.operand1 = a;
		    this.operand2 = b;
	}

	public Unit getUnit() {
	  return unit;
	}

	public void setUnit(Unit unit) {
	  this.unit = unit;
	}

	@Override
	public void execute() {
	  unit.run("+", operand1, operand2);
	}
}
