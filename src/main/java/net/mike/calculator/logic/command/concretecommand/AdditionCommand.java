package net.mike.calculator.logic.command.concretecommand;

import net.mike.calculator.entyties.receiver.ArithmeticUnit;
import net.mike.calculator.logic.command.Command;

//Concrete command
public class AdditionCommand extends Command {
	
	protected ArithmeticUnit aUnit;
	protected int param1, param2;

	
	public AdditionCommand(ArithmeticUnit aUnit, int a, int b) {
		this.aUnit = aUnit;
		this.param1 = a;
		this.param2 = b;
	}

	@Override
	public void execute() {
		
	 aUnit.run("+", param1, param2);
		
	}
		

}
