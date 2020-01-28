package net.mike.calculator.service.invoker.command.concretecommand;

import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;

public class MultiplicationCommand extends Command {
	private ArithmeticUnit unit;//receiver
	private String exp;
	
	public MultiplicationCommand(ArithmeticUnit unit, String exp) {
		this.unit =  unit;
		  this.exp = exp;
	}
	
	public ArithmeticUnit getUnit() {
		return unit;
	}

	public void setUnit(ArithmeticUnit unit) {
		this.unit = unit;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	@Override
	public void execute() {
	  unit.run(exp);
	}
}
