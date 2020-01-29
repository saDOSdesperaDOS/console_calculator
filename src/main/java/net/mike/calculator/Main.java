package net.mike.calculator;

import java.util.Scanner;

import net.mike.calculator.client.Calculator;


public class Main {

	public static void main(String[] args) {
		
		//input
		System.out.println("Введите выражение для вычисления: ");
		
		Scanner input = new Scanner(System.in);
		String exp = input.nextLine();
		/*String exp = "    7   -    2";
		String exp1 = "    7   +    2";
		String exp2 = "7*2";
		String exp3 = "   8 /    2";
		
		c.showMeResult(exp1);
		c.showMeResult(exp2);
		c.showMeResult(exp3);*/
		Calculator c = new Calculator();
		c.showMeResult(exp);
			
			/*for (Operations o  : Operations.values()) {
				System.out.println(o.operation());
			}*/
	        
		
	}
}


