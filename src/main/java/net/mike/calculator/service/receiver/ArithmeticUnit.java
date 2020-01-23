package net.mike.calculator.service.receiver; 
//receiver
public class ArithmeticUnit implements Unit {
	public int rez;
	
	public void run(String operation, String operand1, String operand2 ) {
		
		switch (operation) {
			case "+" :
				rez = Integer.parseInt(operand1) + Integer.parseInt(operand2);
			break;
			case "-":
				rez = Integer.parseInt(operand1) - Integer.parseInt(operand2);
			break;
			case "*":
				rez = Integer.parseInt(operand1) * Integer.parseInt(operand2);
				break;
			case "/":
				rez = Integer.parseInt(operand1) / Integer.parseInt(operand2);
				break;
		}
	}
}
