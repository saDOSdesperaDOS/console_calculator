package net.mike.calculator.service.receiver;

public class ConverterUnit implements Unit {
	
	static int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };
	static String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
	static int last = 2000;
	private String cOperand1, cOperand2, cOperation;
	private String strResult;
	private Integer result;
	
	public String getcOperand1() {
		return cOperand1;
	}
	public void setcOperand1(String cOperand1) {
		this.cOperand1 = cOperand1;
	}
	public String getcOperand2() {
		return cOperand2;
	}
	public void setcOperand2(String cOperand2) {
		this.cOperand2 = cOperand2;
	}
	public String getcOperation() {
		return cOperation;
	}
	public void setcOperation(String cOperation) {
		this.cOperation = cOperation;
	}
	
	public String getStrResult() {
		return strResult;
	}
	public void setStrResult(String strResult) {
		this.strResult = strResult;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cOperand1 == null) ? 0 : cOperand1.hashCode());
		result = prime * result + ((cOperand2 == null) ? 0 : cOperand2.hashCode());
		result = prime * result + ((cOperation == null) ? 0 : cOperation.hashCode());
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
		ConverterUnit other = (ConverterUnit) obj;
		if (cOperand1 == null) {
			if (other.cOperand1 != null)
				return false;
		} else if (!cOperand1.equals(other.cOperand1))
			return false;
		if (cOperand2 == null) {
			if (other.cOperand2 != null)
				return false;
		} else if (!cOperand2.equals(other.cOperand2))
			return false;
		if (cOperation == null) {
			if (other.cOperation != null)
				return false;
		} else if (!cOperation.equals(other.cOperation))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ConverterUnit [cOperand1=" + cOperand1 + ", cOperand2=" + cOperand2 + ", cOperation=" + cOperation
				+ "]";
	}
	
	public static String convertRomanToInt(String romanNumeral) throws NumberFormatException {
		Integer integerValue = 0;
 
		for (int i = 0; i < romanNumeral.length(); i++)	{
			char ch = romanNumeral.charAt(i);
			String number = letterToNumber(ch);
			if ( Integer.parseInt(number) == -1) {
				throw new NumberFormatException("Invalid format");
			}
			int num = 0;
			if (last<Integer.parseInt(number))  num = Integer.parseInt(number) - last - 1;
				integerValue += num;
				last = num;
		}
		return integerValue.toString();
	}
	
	
 
	private static String letterToNumber(char letter) {
 
		switch (letter) {
			case 'I':  return "1";
			case 'V':  return "5";
			case 'X':  return "10";
			case 'L':  return "50";
			case 'C':  return "100";
			case 'D':  return "500";
			case 'M':  return "1000";
			default:   return "-1";
		}
	}
	public static String convertIntegerToRoman(int number) {
		String romanValue = "";
		int N = number;
		while ( N > 0 ) {
			for (int i = 0; i < numbers.length; i++) {
				if ( N < numbers[i] ) {
					N -= numbers[i-1];
					romanValue += letters[i-1];
					break;
			    }
			}
		}
		return romanValue;
	}
	
	@Override
	public String run(String operation, String operand1, String operand2 ) {
		
		cOperation = operation;
		cOperand1 = ConverterUnit.convertRomanToInt(operand1);
		cOperand2 = ConverterUnit.convertRomanToInt(operand2);
		return cOperation + " " + cOperand1 + " " + cOperand2;
	}
	


}
