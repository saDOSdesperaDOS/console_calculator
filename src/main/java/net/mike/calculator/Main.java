package net.mike.calculator;

import java.util.Scanner;

import net.mike.calculator.client.Calculator;


public class Main {

	public static void main(String[] args) {
		
		//input
		System.out.println("Введите выражение для вычисления: ");
		
		Scanner input = new Scanner(System.in);
		String exp = input.nextLine();

		Calculator c = new Calculator(); 
		c.showMeResult(exp);
	}
}


