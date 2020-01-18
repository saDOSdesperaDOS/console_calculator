package net.mike.calculator.logic.command.concretecommand;

import net.mike.calculator.entyties.receiver.ArithmeticUnit;
import net.mike.calculator.logic.command.Command;

//Concrete command
public class AdditionCommand extends Command {
	
	protected ArithmeticUnit unit;//receiver
	protected int param1, param2;

	
	public AdditionCommand(ArithmeticUnit aUnit, int a, int b) {
		this.unit = aUnit;
		this.param1 = a;
		this.param2 = b;
	}

	@Override
	public void execute() {
		
	 unit.run("+", param1, param2);
		
	}
		

}
