package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;

public class ConvertCommand extends Command {
	ArithmeticUnit unit;//receiver
	 String command;
	
	public ConvertCommand(ArithmeticUnit unit, String command) {
		super();
		this.unit = unit;
		this.command = command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
}
