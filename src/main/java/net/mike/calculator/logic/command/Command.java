package net.mike.calculator.logic.command;

import net.mike.calculator.entyties.receiver.ArithmeticUnit;

//Command
	public abstract class Command {
		
		protected ArithmeticUnit aUnit;
		protected int operand;
		
		public abstract void execute();
	}
