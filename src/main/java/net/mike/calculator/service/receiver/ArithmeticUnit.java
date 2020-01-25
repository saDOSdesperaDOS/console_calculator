package net.mike.calculator.service.receiver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import net.mike.calculator.service.receiver.ArithmeticUnit.OperandType;
import net.mike.calculator.service.receiver.ArithmeticUnit.Spliter;


//receiver
		public class ArithmeticUnit {
		
			private String exp;
			private int result;
			private String[] operandsList;
			private String operator;
			private Spliter spliter;
			
			public void run(String exp ) {
				ArithmeticUnit unit = new ArithmeticUnit();
				Spliter sp = unit.new Spliter();
				String[] operandsList = sp.getOperands(exp);
				String operator = sp.getOperator(exp);
				Number operand1 = Integer.parseInt(operandsList[0]);
				Number operand2 = Integer.parseInt(operandsList[1]);
				Operations op  = Operations.ADD;
				System.out.println(op.apply(operand1, operand2));
				
			}
			
			public String getExp() {
				return exp;
			}
		
			public void setExp(String exp) {
				this.exp = exp;
			}
		
			public int getResult() {
				return result;
			}
		
			public void setResult(int result) {
				this.result = result;
			}
	
			public enum Operations {

			    ADD("+") {
			        @Override
			        public Number apply(Number x, Number y) {
			            return x.doubleValue() + y.doubleValue();
			        }
			    },
			    SUBTRACT("-") {
			        @Override
			        public Number apply(Number x, Number y) {
			            return x.doubleValue() - y.doubleValue();
			        }
			    },
			    DIVIDE("/") {
			        @Override
			        public Number apply(Number x, Number y) {
			            return x.doubleValue() / y.doubleValue();
			        }
			    },
			    MULTIPLY("*") {
			        @Override
			        public Number apply(Number x, Number y) {
			            return x.doubleValue() * y.doubleValue();
			        }
			    };
				private String operation;
				
			    Operations(String operation) {

			        this.operation = operation;
			    }

			    public String getOperation() {
			        return operation;
			    }

			    public abstract Number apply(Number x, Number y);

			    
			}
	
	public enum OperandType {
			ARABIC,
		      ROMAN
		}
	
	public enum RomanOperand {

	    I(1), IV(4), V(5), IX(9), X(10),
	    XL(40), L(50), XC(90), C(100),
	    CD(400), D(500), CM(900), M(1000);

	    private int value;

	    RomanOperand(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }

	    public static List<RomanOperand> getReverseSortedValues() {
	        return Arrays.stream(values())
	                .sorted(Comparator.comparing((RomanOperand e) -> e.value).reversed())
	                .collect(Collectors.toList());
	    }
	}
	
	public class Checker{
		
	}	
	
	public class Converter {
			
			private OperandType operandType;
		
			public OperandType getOperandType(String exp) {
		
		        return isArabic(exp) ? OperandType.ARABIC : OperandType.ROMAN;
		    } 
			
			public boolean isArabic(String exp) {
		
			       return exp.matches("[0-9]+\\s*[+-/*]+\\s*[0-9]+");
			   }
			
			 public int romanToArabic(String input) {

			        String romanNumeral = input.toUpperCase();
			        int result = 0;

			        List<RomanOperand> romanOperands = RomanOperand.getReverseSortedValues();

			        int i = 0;

			        while ((romanNumeral.length() > 0) && (i < romanOperands.size())) {
			            RomanOperand symbol = romanOperands.get(i);
			            if (romanNumeral.startsWith(symbol.name())) {
			                result += symbol.getValue();
			                romanNumeral = romanNumeral.substring(symbol.name().length());
			            } else {
			                i++;
			            }
			        }

			        if (romanNumeral.length() > 0) {
			            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
			        }

			        return result;
			    }

			    public String arabicToRoman(int number) {

			        List<RomanOperand> romanOperands = RomanOperand.getReverseSortedValues();

			        int i = 0;
			        StringBuilder sb = new StringBuilder();

			        while ((number > 0) && (i < romanOperands.size())) {
			            RomanOperand currentSymbol = romanOperands.get(i);
			            if (currentSymbol.getValue() <= number) {
			                sb.append(currentSymbol.name());
			                number -= currentSymbol.getValue();
			            } else {
			                i++;
			            }
			        }

			        return sb.toString();
			          }
			    
			    public boolean checkOperands(String exp) {
			    	if(new Converter().getOperandType(exp) == OperandType.valueOf("ROMAN")) 
					  return true;
			      return false;
			      }
	}
	
		public class Spliter {
		
			public String[] getOperands(String exp) {
		
		        return exp.split("[+-/*]", 2);
		    }
		
			public String getOperator(String exp) {
		
		        return exp.toUpperCase().replaceAll( "[0-9],[IVXLCM]", "");
		    }
		
		}
	}