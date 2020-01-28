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
	Operations op;

	public void add(String exp) {
		/*// нужно разобрать exp, чтобы узнать command
		1*/
		
		ArithmeticUnit unit = new ArithmeticUnit();
		Operations op1 = Operations.ADD;
		AdditionCommand command = new AdditionCommand(unit, exp, op1);
		run(command);//нужно разложить гдето с верху стека
	}
	public void sub(String exp) {
		/*// нужно разобрать exp, чтобы узнать command
		1*/
		
		ArithmeticUnit unit = new ArithmeticUnit();
		Operations op1 = Operations.SUBTRACT;
		AdditionCommand command = new AdditionCommand(unit, exp, op1);
		run(command);//нужно разложить гдето с верху стека
	}
	
	public void mul(String exp) {
		/*// нужно разобрать exp, чтобы узнать command
		1*/
		
		ArithmeticUnit unit = new ArithmeticUnit();
		Operations op1 = Operations.MULTIPLY;
		AdditionCommand command = new AdditionCommand(unit, exp, op1);
		run(command);//нужно разложить гдето с верху стека
	}
	
	public void div(String exp) {
		/*// нужно разобрать exp, чтобы узнать command
		1*/
		
		ArithmeticUnit unit = new ArithmeticUnit();
		Operations op1 = Operations.DIVIDE;
		AdditionCommand command = new AdditionCommand(unit, exp, op1);
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
		if (s.checkSpace(exp)) {
			exp = s.replace(exp);
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
