package net.mike.calculator.entyties.invoker;

import java.util.List;

import net.mike.calculator.logic.command.Command;

public class ControlUnit {
	
	private List<Command> commands;
	private int current = 0;
	
	public void StoreCommand(Command command) {
		commands.add(command);
	}
	public void ExecuteCommand() {
		commands.get(current).execute();
		current++;
	}
}