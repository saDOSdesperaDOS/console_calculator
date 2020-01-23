package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.Unit;

//Concrete command
public class AdditionCommand extends Command {
	
	protected Unit unit;//receiver
	protected String param1, param2;

	
	public AdditionCommand(Unit unit, String a, String b) {
		this.unit =  unit;
		this.param1 = a;
		this.param2 = b;
	}

	@Override
	public void execute() {
		
	 unit.run("+", param1, param2);
		
	}
		

}
