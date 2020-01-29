package net.mike.calculator.service.invoker.command.concretecommand;

import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Operations;

public class MultiplicationCommand extends Command {
	
	private ArithmeticUnit unit;//receiver
	private String exp;
	
	public MultiplicationCommand(String exp) {
		  this.exp = exp;
	}
 
	@Override
	public void execute() {
	  unit = new ArithmeticUnit();
	  unit.setOp(Operations.MULTIPLY);
		unit.run(exp);
	}
}
