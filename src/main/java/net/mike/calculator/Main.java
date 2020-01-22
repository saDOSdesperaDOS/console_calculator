package net.mike.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.mike.calculator.entyties.client.Calculator;
import net.mike.calculator.entyties.receiver.ConverterUnit;
import net.mike.calculator.logic.command.concretecommand.ConvertCommand;

public class Main {

	public static void main(String[] args) throws IOException {
		ConverterUnit cc = null;
		System.out.println("Start App");
		String operand1, operand2;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		cc.run(str);
		System.out.println();
		
		
		
	}
}

