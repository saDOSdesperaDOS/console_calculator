  package net.mike.calculator.client;

import java.util.Arrays;

import net.mike.calculator.service.invoker.Controller;
import net.mike.calculator.service.invoker.command.Command;
import net.mike.calculator.service.invoker.command.concretecommand.AdditionCommand;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Operations;
import net.mike.calculator.service.receiver.ArithmeticUnit.Spliter;

//client
public class Calculator {
	
	Controller controller;
	

	public void add(String exp) {
		/*// нужно разобрать exp, чтобы узнать command
		1*/
		ArithmeticUnit unit = new ArithmeticUnit();
		AdditionCommand command = new AdditionCommand(unit, exp);
		run(command);//нужно разложить гдето с верху стека
	}
	
	public void run(Command command) {
		controller = new Controller();  
		controller.setCommand(command);
		controller.ExecuteCommand();    
	}

	/*public String sub(String a, String b) {
		this.setArithmeticUnit(unit);
		return run(new SubstractionCommand(this.getArithmeticUnit(), a, b));
	}
	
	public String mul(String a, String b) {
		this.setArithmeticUnit(unit);
		return run(new MultiplicationCommand(this.getArithmeticUnit(), a, b));
	}
	
	public String div(String a, String b) {
		this.setArithmeticUnit(unit);
		 return run(new DivisionCommand(this.getArithmeticUnit(), a, b));
	}*/
	public void showMeResult(String exp) {
		ArithmeticUnit u = new ArithmeticUnit();
		Spliter s = u.new Spliter();
		String exp2 = null;
		if (s.check(exp)) {
			exp2 = s.replace(exp);
		}
		System.out.println(exp2);
	}
	
}
