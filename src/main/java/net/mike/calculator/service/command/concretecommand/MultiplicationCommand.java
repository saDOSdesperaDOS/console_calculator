package net.mike.calculator.service.command.concretecommand;

import net.mike.calculator.service.command.Command;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.Unit;

public class MultiplicationCommand extends Command {
	
	private Unit unit = new ArithmeticUnit();//receiver
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	private String param1, param2;
	
	public MultiplicationCommand(Unit unit, String a, String b) {
		this.unit = unit;
		this.param1 = a;
		this.param2 = b;
	}
	@Override
	public String execute() {
		return unit.run("*", this.getParam1(), this.getParam2());		
	}

}
