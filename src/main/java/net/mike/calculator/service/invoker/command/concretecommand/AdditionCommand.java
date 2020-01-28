package net.mike.calculator.service.invoker.command.concretecommand;

import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Operations;

//Concrete command
public class AdditionCommand extends Command {
	
	private ArithmeticUnit unit;//receiver
	private String exp;
	private Operations op;
	
	public void setOp(Operations op) {
		this.op = op; 
	}

	public AdditionCommand(ArithmeticUnit unit, String exp, Operations op) {
		this.unit =  unit;
		this.op = op;
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
	
	public Operations getOp() {
		return this.op;
	}

	@Override
	public void execute() {
		unit.setOp(op);
		unit.run(exp);
	}
}
