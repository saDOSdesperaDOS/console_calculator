package net.mike.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.mike.calculator.entyties.client.Calculator;



public class Main {

	public static void main(String[] args) {
		System.out.println("Start App");
		Calculator calculator = new Calculator();
		
		
		System.out.println(calculator.div("8", "2"));
		 
  			/*System.out.println("Enter expression: ");

  			Scanner input = new Scanner(System.in);
  			List<String> ex = new ArrayList<String>();
  			
  			while(input.hasNext()) {
  				
  				String str = input.next();
  				ex.add(str);
  			}
  			
  			System.out.println(ex.size());
  			String c = ex.get(0);*/
  			
  			/*try {

  				if ( Character.isDigit( c ) )//если число
  				{				
  					int int_value = Integer.parseInt( value );

  					System.out.println("Roman value = " + Numeral.convertIntegerToRoman(int_value));
  				}
  				else {

  					System.out.println("Integer value = " + Numeral.convertRomanToInt(value));
  				}
  			}
  			catch( NumberFormatException e)
  			{
  				System.out.println("Problem: Invalid format");
  			}*/

            }
		
		
	}


