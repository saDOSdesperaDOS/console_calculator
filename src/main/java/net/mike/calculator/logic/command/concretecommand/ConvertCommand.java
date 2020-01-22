package net.mike.calculator.logic.command.concretecommand;

import net.mike.calculator.entyties.receiver.ConverterUnit;
import net.mike.calculator.logic.command.Command;

public class ConvertCommand extends Command {
	
	ConverterUnit unit;//receiver
	String command;
	
	public ConvertCommand(ConverterUnit unit, String command) {
		super();
		this.unit = unit;
		this.command = command;
	}
	@Override
	public void execute() {
		unit.run(command);
	}

}
