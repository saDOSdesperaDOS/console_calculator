package net.mike.calculator;

import java.util.Iterator;
import java.util.Scanner;

import net.mike.calculator.client.Calculator;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Converter;
import net.mike.calculator.service.receiver.ArithmeticUnit.OperandType;
import net.mike.calculator.service.receiver.ArithmeticUnit.Spliter;


public class Main {

	public static void main(String[] args) {
		
		//input
		System.out.println("Введите выражение для вычисления: ");
		//Scanner input = new Scanner(System.in);
		//String exp = input.nextLine();
		String exp = "IV+IX";
		ArithmeticUnit unit = new ArithmeticUnit();
		Converter converter = unit.new Converter();
		System.out.println(converter.checkOperands(exp));
		/*System.out.println("Так это румынские!!");
		Spliter spliter = new ArithmeticUnit().new Spliter();
		return (new Converter().romanToArabic(spliter.getOperands(exp)[0]) +
		 ", " + new Converter().romanToArabic(spliter.getOperands(exp)[1]));*/
		
		
		//Просим Controller создать и отправить ArithmeticUnit комманду AdditionalCommand
		//Calculator c = new Calculator();
		//c.add(exp);

	        
		
	}
}


