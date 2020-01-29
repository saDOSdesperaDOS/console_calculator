package net.mike.calculator.client;

import net.mike.calculator.service.invoker.Controller;
import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.invoker.command.concretecommand.AdditionCommand;
import net.mike.calculator.service.invoker.command.concretecommand.DivisionCommand;
import net.mike.calculator.service.invoker.command.concretecommand.MultiplicationCommand;
import net.mike.calculator.service.invoker.command.concretecommand.SubtractionCommand;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Spliter;

//client
public class Calculator {
	
	Controller controller;

	public void add(String exp) {
		AdditionCommand command = new AdditionCommand(exp);
		  run(command);
	} 
	
	public void sub(String exp) {
		SubtractionCommand command = new SubtractionCommand(exp);
          run(command);
	}
	
	public void mul(String exp) {
		MultiplicationCommand command = new MultiplicationCommand(exp);
		run(command);
	}
	
	public void div(String exp) {
		DivisionCommand command = new DivisionCommand(exp);
		run(command);
	}
	
	public void run(Command command) {
		controller = new Controller();  
		controller.setCommand(command); 
		controller.ExecuteCommand();    
	}


	public void showMeResult(String exp) {
		
		ArithmeticUnit u = new ArithmeticUnit();
		Spliter s = u.new Spliter();
		
		if (s.checkSpace(exp)) {
			exp = s.replaceSpace(exp);
		  } 
		
		if(exp.contains("+")) {
			  this.add(exp);
		  } else if (exp.contains("-")) {
			    this.sub(exp);
		    } else if (exp.contains("*")) {
			      this.mul(exp);
		      } else if (exp.contains("/")) {
			        this.div(exp);
		        }
	}
}
