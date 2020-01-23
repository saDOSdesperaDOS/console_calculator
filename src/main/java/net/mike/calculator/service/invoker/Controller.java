package net.mike.calculator.service.invoker;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.Unit;

//invoker

public class Controller  {
	
	private Command command;
	
	public void setCommand(Command command) {
		  this.command = command;
		}
	
	public void ExecuteCommand() {
	  command.execute();
	}

	public Command getCommand() {
	  return command;
	}

	
	
	


}