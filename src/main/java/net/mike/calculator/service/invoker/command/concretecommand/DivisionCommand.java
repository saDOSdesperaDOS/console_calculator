package net.mike.calculator.service.invoker.command.concretecommand;

import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Operations;

public class DivisionCommand extends Command {
	
	private ArithmeticUnit unit;
	private String exp;
	
	public DivisionCommand(String exp) {
		  this.exp = exp;
	}

	@Override
	public void execute() {
	  unit = new ArithmeticUnit();
	  unit.setOp(Operations.DIVIDE);
	  unit.run(exp);
	}
}
