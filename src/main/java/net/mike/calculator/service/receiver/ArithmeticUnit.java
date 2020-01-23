package net.mike.calculator.service.receiver; 
//receiver
public class ArithmeticUnit implements Unit {

	private String strResult;
	private Integer result;

	public String getResult() {
		return strResult;
	}

	public void setResult(String result) {
		this.strResult = result;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result + ((strResult == null) ? 0 : strResult.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArithmeticUnit other = (ArithmeticUnit) obj;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (strResult == null) {
			if (other.strResult != null)
				return false;
		} else if (!strResult.equals(other.strResult))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "ArithmeticUnit [strResult=" + strResult + ", result=" + result + "]";
	}

	@Override
	public String run(String operation, String operand1, String operand2 ) {
		
		switch (operation) {
			case "+" :
				result = Integer.parseInt(operand1) + Integer.parseInt(operand2);
				strResult = result.toString();
				//System.out.println(strResult);
			break;
			case "-":
				result = Integer.parseInt(operand1) - Integer.parseInt(operand2);
				strResult = result.toString();
				//System.out.println(strResult);
			break;
			case "*":
				result = Integer.parseInt(operand1) * Integer.parseInt(operand2);
				strResult = result.toString();
				//System.out.println(strResult);
				break;
			case "/":
				result = Integer.parseInt(operand1) / Integer.parseInt(operand2);
				strResult = result.toString();
				//System.out.println(strResult);
				break;
		}
		return strResult;
	}
}
