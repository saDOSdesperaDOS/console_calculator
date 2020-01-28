package net.mike.calculator.service.receiver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import net.mike.calculator.service.receiver.ArithmeticUnit.Converter;
import net.mike.calculator.service.receiver.ArithmeticUnit.OperandType;
import net.mike.calculator.service.receiver.ArithmeticUnit.Spliter;


//receiver
		public class ArithmeticUnit {
		
			private String exp;
			private Number result;
			private String[] operandsList;
			private String operator;
			private Spliter spliter;
			
			
			public String[] getOperandsList() {
				return operandsList;
			}

			public void setOperandsList(String[] operandsList) {
				this.operandsList = operandsList;
			}

			public String getOperator() {
				return operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public Spliter getSpliter() {
				return spliter;
			}

			public void setSpliter(Spliter spliter) {
				this.spliter = spliter;
			}

			public String getExp() {
				return exp;
			}
		
			public void setExp(String exp) {
				this.exp = exp;
			}
		
			public Number getResult() {
				return result;
			}
		
			public void setResult(Number result) {
				this.result = result;
			}
			public void run(String exp ) {
				ArithmeticUnit unit = new ArithmeticUnit();
				Spliter sp = unit.new Spliter();
				Converter converter = unit.new Converter();
				Number operand1 = null;
				Number operand2 = null;
				Operations op = null;
				String operator = sp.getOperator(exp);
				String[] operandsList = sp.getOperands(exp);
				if (converter.getOperandType(exp) == OperandType.ROMAN) {
					operand1 = converter.romanToArabic(operandsList[0]);
					operand2 = converter.romanToArabic(operandsList[1]);
				  } else {
				    operand1 = Integer.parseInt(operandsList[0]);
				    operand2 = Integer.parseInt(operandsList[1]);
				      }
					
				switch (operator) {
					  case "+": op = Operations.ADD;
						  break;
					  case "-": op = Operations.SUBTRACT;
					      break;
					  case "*": op = Operations.MULTIPLY;
					      break;
					  case "/": op = Operations.DIVIDE;
					      break;
					  default:
						  break;
				}
				
				result = op.apply(operand1, operand2);
				int r2;
				
				r2 =  result.intValue();//нужно Number еревести в int
				if (converter.getOperandType(exp) == OperandType.ROMAN) {
					
					String r3 = converter.arabicToRoman(r2);
					System.out.println(r3);
				} else {
					System.out.println(r2);
				}
			}
			
			public enum Operations {

			    ADD("+") {
			        @Override
			        public Number apply(Number x, Number y) {
			            return x.intValue() + y.intValue();
			        }
			    },
			    SUBTRACT("-") {
			        @Override
			        public Number apply(Number x, Number y) {
			            return x.intValue() - y.intValue();
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
			        public Number apply( Number x, Number y) {
			            return x.intValue() * y.intValue();
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
	}
	
		public class Spliter {
			
			public boolean check(String exp) {
				boolean result = false;
				  if (exp.contains(" ")) result = true; 
				    return result;
			  }
			public String[] getOperands(String exp) {
		
		        return exp.split("[+-/*]", 2);
		    }
		
			public String getOperator(String exp) {
		
		        return exp.toUpperCase().replaceAll( "[0-9],[IVXLCM]", "");
		    }
			
			public String replace(String exp) {
				return exp.toUpperCase().replace(" ", "");
			}
		
		}
	}