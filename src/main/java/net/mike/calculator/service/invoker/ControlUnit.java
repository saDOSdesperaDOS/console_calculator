package net.mike.calculator.service.invoker;

import net.mike.calculator.service.command.Command;

//invoker

public class ControlUnit {
	
	@Override
	public String toString() {
		return "ControlUnit [command=" + command + "]";
	}

	private Command command;
	
	public String ExecuteCommand() {
		 
		return command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
}