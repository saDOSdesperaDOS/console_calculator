package net.mike.calculator.service.receiver; 
//receiver
public class ArithmeticUnit implements Unit {

	private int result;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public void run(String operation, int operand1, int operand2 ) {
		
		switch(operation) {
		  case "+" :
			result = operand1 + operand2;
		   break;
			  case "-":
				result = operand1- operand2;
		      break;
			    case "*":
				  result = operand1 * operand2;
                    break;
			          case "/":
			            result = operand1 / operand2;
                             break;
	 }
		System.out.println(result);
  }
}
