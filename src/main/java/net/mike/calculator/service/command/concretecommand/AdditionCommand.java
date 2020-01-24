package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;

//Concrete command
public class AdditionCommand extends Command {
	
	private ArithmeticUnit unit;//receiver
	private String exp;

	
	public AdditionCommand(ArithmeticUnit unit, String exp) {
		this.unit =  unit;
		  this.exp = exp;
		 
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
