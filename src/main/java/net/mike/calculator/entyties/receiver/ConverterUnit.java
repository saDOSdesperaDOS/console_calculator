package net.mike.calculator.entyties.receiver;


import net.mike.calculator.service.NumeralType;

//receiver
public class ConverterUnit {
	static int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };
	static String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
	static int last = 2000;
	 private static NumeralType numeralType;
 
	public static int convertRomanToInt(String romanNumeral) throws NumberFormatException {
		int integerValue = 0;
 
		for (int i = 0; i < romanNumeral.length(); i++)	{
			char ch = romanNumeral.charAt(i);
			int number = letterToNumber(ch);
			if ( number == -1) {
				throw new NumberFormatException("Invalid format");
			}
			if (last<number) number=number - last - 1;
				integerValue += number;
				last = number;
		}
		return integerValue;
	}
 
	private static int letterToNumber(char letter) {
 
		switch (letter) {
			case 'I':  return 1;
			case 'V':  return 5;
			case 'X':  return 10;
			case 'L':  return 50;
			case 'C':  return 100;
			case 'D':  return 500;
			case 'M':  return 1000;
			default:   return -1;
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
	
	private static int getNumber(String input) {

	       return numeralType == NumeralType.ARABIC ? Integer.valueOf(input) :
	               ConverterUnit.convertRomanToInt(input);
	}
	
	private static void printErrorMessage() {
        
		System.err.println("Wrong expression format. \n" +
                "The format should be whether Roman or Arabic\n" +
                "numeral with some of these operators +-/*.\n" +
                "e.g. VI * II, 100 / 25, 1344 + 1959 etc.");
    }
	
	private static NumeralType getNumeralType(String command) {

	        return isArabic(command) ? NumeralType.ARABIC : NumeralType.ROMAN;
	}
	
	private static String getOperator(String command) {

	       return command.toUpperCase().replaceAll(getPattern(), "");
	}
	 
	private static String getPattern() {

	        return numeralType == NumeralType.ARABIC ? "[0-9]" : "[IVXLCM]";
	}
	 
	private static String[] getNumerals(String command) {

	       return command.split("[+-/*]", 2);
	}
	
	private static boolean isArabic(String command) {

	      return command.matches("[0-9]+\\s*[+-/*]+\\s*[0-9]+");
    }
	 
	public void run(String command) {
		if(isArabic(command))  convertIntegerToRoman(Integer.parseInt(command));
		else  convertRomanToInt(command);
	}
}
