package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.Unit;

public class MultiplicationCommand extends Command {
	
	protected Unit unit;
	protected String param1, param2;
	
	public MultiplicationCommand(Unit unit, String param1, String param2) {
		this.unit = unit;
		this.param1 = param1;
		this.param2 = param2;
	}
	@Override
	public void execute() {
		unit.run("*", param1, param2);
	}

}
