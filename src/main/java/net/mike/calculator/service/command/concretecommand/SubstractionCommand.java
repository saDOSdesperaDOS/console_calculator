package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.Unit;

public class SubstractionCommand extends Command {

	protected Unit unit;//receiver
	protected String param1, param2;
	
	public SubstractionCommand(Unit unit, String a, String b) {
		this.unit =unit;
		this.param1 = a;
		this.param2 = b;
	}
	@Override
	public void execute() {
		 unit.run("-", param1, param2);
		
	}

}
