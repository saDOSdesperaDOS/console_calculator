package net.mike.calculator.service.receiver;


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
				Number n1 = Integer.parseInt(operandsList[0]);
				Number n2 = Integer.parseInt(operandsList[1]);
				Operations op  = Operations.ADD;
				System.out.println(op.apply(n1, n2));
				
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
	
		
		public class Converter {
			
			private OperandType operandType;
		
			public OperandType getOperandType(String exp) {
		
		        return isArabic(exp) ? OperandType.ARABIC : OperandType.ROMAN;
		    } 
			
			public boolean isArabic(String exp) {
		
			       return exp.matches("[0-9]+\\s*[+-/*]+\\s*[0-9]+");
			   }
			
			public String getPattern() {
		
		        return operandType == OperandType.ARABIC ? "[0-9]" : "[IVXLCM]";
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