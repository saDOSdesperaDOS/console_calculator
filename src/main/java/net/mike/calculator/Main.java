package net.mike.calculator;

import java.util.Scanner;

import net.mike.calculator.entyties.client.Calculator;
import net.mike.calculator.logic.convert.Converter;

public class Main {

	public static void main(String[] args) {
		/*System.out.println("Start App");
		Calculator calculator = new Calculator();
		System.out.println(calculator.div(8, 2));*/
		 Converter Numeral = new Converter();
		 
		 
  			System.out.println("Enter your Roman Numerals or Integer number:");

  			Scanner console = new Scanner(System.in);
  			String value = console.next();

  			try {
  				char c = value.charAt( 0 );

  				if ( Character.isDigit( c ) )
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
  			}

            }
		
		
	}


