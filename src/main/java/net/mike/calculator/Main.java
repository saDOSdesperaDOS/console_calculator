package net.mike.calculator;

import net.mike.calculator.entyties.receiver.ArithmeticUnit;
import net.mike.calculator.logic.command.Command;
import net.mike.calculator.logic.command.concretecommand.AdditionCommand;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start App");
		
		ArithmeticUnit aU = new ArithmeticUnit();
		System.out.println(7 +8);

	}

}
