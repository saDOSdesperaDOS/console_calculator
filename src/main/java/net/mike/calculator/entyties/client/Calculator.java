  package net.mike.calculator.entyties.client;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.command.concretecommand.AdditionCommand;
import net.mike.calculator.service.invoker.Controller;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ConverterUnit;
import net.mike.calculator.service.receiver.Unit;

//client
public class Calculator {
	
	private String result;
	private Controller controller;
	private Unit unit;
	Command command;
	
	public Calculator() {

	}
	
	public void run(Command command) {
		controller = new Controller();  
		controller.setCommand(command);
		controller.ExecuteCommand();
	}
	
	public void add(String a, String b) {
		unit = new ArithmeticUnit();
		/*Эту проверку осуществляем в ArithmeticUnit
		 * 1.если параметры  a, b арфбские цифры, то
		 * 2.проводим с ними арифмитич. операции
		 * 3.если нет, то парвметры являются римскими цифрами
		 * 4.и мы переводими их в арабские
		 * 5.производим с ними арифм. операции 
		 * 6.и результат переводим обратно в римские цифры
		 * 
		 * 
		 * */
		command = new AdditionCommand(unit, a, b);
		run(command);
	}
	
	public Unit getUnit() {
	  return unit;
	}

	public void setUnit(Unit unit) {
	  this.unit = unit;
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
	
}
