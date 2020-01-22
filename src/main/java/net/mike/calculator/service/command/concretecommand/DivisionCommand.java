package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;

public class DivisionCommand extends Command {

	protected ArithmeticUnit aUnit;
	protected int param1, param2;
	
	public DivisionCommand(ArithmeticUnit aUnit, int param1, int param2) {
		this.aUnit = aUnit;
		this.param1 = param1;
		this.param2 = param2;
	}
	
	@Override
	public void execute() {
		aUnit.run("/", param1, param2);
		
	}

}
