package net.mike.calculator.service.invoker;

import net.mike.calculator.logic.command.Command;

//invoker

public class ControlUnit {
	
	private Command command;
	
	public void ExecuteCommand() {
		 command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
}