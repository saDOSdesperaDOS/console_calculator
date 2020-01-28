package net.mike.calculator;

import java.util.Iterator;
import java.util.Scanner;

import net.mike.calculator.client.Calculator;
import net.mike.calculator.service.receiver.ArithmeticUnit;
import net.mike.calculator.service.receiver.ArithmeticUnit.Converter;
import net.mike.calculator.service.receiver.ArithmeticUnit.Spliter;


public class Main {

	public static void main(String[] args) {
		
		//input
		System.out.println("Введите выражение для вычисления: ");
		//Scanner input = new Scanner(System.in);
		//String exp = input.nextLine();
		String exp = "  12 +    9   ";
		
		//Просим Controller создать и отправить ArithmeticUnit комманду AdditionalCommand
		Calculator c = new Calculator();
		c.showMeResult(exp);
		

	        
		
	}
}


