package net.mike.calculator.service.invoker.command.concretecommand;

import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Operations;

//Concrete command
public class AdditionCommand extends Command {
	
	private ArithmeticUnit unit;//receiver
	private String exp;
	
	
	public AdditionCommand(String exp) {
		  this.exp = exp;
	}
 
	@Override
	public void execute() {
		unit = new ArithmeticUnit();
		unit.setOp(Operations.ADD);
		unit.run(exp);
	}
}
