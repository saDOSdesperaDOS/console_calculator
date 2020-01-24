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
	public void run(String operation, String operand1, String operand2 ) {
		
		int iOperand1 = Integer.parseInt(operand1);
		int iOperand2 = Integer.parseInt(operand2);
		
		switch(operation) {
		  case "+" :
			result = iOperand1 + iOperand2;
		   break;
			  case "-":
				result = iOperand1- iOperand2;
		      break;
			    case "*":
				  result = iOperand1 * iOperand2;
                    break;
			          case "/":
			            result = iOperand1 / iOperand2;
                             break;
	 }
		System.out.println(result);
  }
}
