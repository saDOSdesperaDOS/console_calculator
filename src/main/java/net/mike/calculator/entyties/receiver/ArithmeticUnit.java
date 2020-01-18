package net.mike.calculator.entyties.receiver; 
//receiver
public class ArithmeticUnit {
	public int rez;
	
	public void run(String operation, int operand1, int operand2 ) {
		
		switch (operation) {
			case "+" :
				rez = operand1 + operand2;
			break;
			case "-":
				rez = operand1 - operand2;
			break;
		}
	}
}
