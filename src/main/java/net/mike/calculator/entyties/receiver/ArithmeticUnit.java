package net.mike.calculator.entyties.receiver; 

public class ArithmeticUnit {
	int rez;
	
	public void run(String operation, int operand1, int operand2 ) {
		
		switch (operation) {
			case "+" :
				operand1 += operand2;
			break;
			case "-":
				operand1 -= operand2;
		default:
			break;
		}
	}
}
