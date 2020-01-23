package net.mike.calculator.service.command.concretecommand.convert_command;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ConverterUnit;
import net.mike.calculator.service.receiver.Unit;

public class ConvertCommand extends Command {
	 Unit unit;//receiver
	 String command;
	
	public ConvertCommand(ConverterUnit unit, String command) {
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
