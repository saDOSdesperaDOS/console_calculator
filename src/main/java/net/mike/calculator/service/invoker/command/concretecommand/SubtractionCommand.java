package net.mike.calculator.service.invoker.command.concretecommand;

import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Operations;

public class SubtractionCommand extends Command {

	private ArithmeticUnit unit;//receiver
	private String exp;
	
	public SubtractionCommand(String exp) {
		  this.exp = exp;
	} 

	@Override
	public void execute() {
		unit = new ArithmeticUnit();
		unit.setOp(Operations.SUBTRACT);
	    unit.run(exp);
	}

}
