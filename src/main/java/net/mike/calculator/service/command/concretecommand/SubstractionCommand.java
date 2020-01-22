package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;

public class SubstractionCommand extends Command {

	protected ArithmeticUnit aUnit;
	protected int param1, param2;
	
	public SubstractionCommand(ArithmeticUnit aUnit, int a, int b) {
		this.aUnit = aUnit;
		this.param1 = a;
		this.param2 = b;
	}
	@Override
	public void execute() {
		 aUnit.run("-", param1, param2);
		
	}

}
