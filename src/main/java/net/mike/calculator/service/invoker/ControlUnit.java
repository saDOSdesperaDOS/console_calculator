package net.mike.calculator.service.invoker;

import net.mike.calculator.logic.command.Command;

public class ControlUnit {
	
	private Command command;
	
	public void ExecuteCommand() {
		command.execute();
	}
}