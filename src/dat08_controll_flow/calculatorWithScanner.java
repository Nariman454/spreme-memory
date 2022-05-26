package dat08_controll_flow;

import java.util.Scanner;

public class calculatorWithScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Number A");
		double numA = scan.nextDouble();
		System.out.println("Enter number B");
		double numB = scan.nextDouble();
		System.out.println("Type one of the following operators: ");
		System.out.println("+,-,*,/");
		String operator = scan.next();
		double total =0;
		if (operator.equals("+")) { total = numA+numB;}
		if (operator.equals("-")) { total = numA-numB;}
		if (operator.equals("*")) { total = numA*numB;}
		if (operator.equals("/")) { total = numA/numB;}
		System.out.println(numA + " "+ operator + " "+numB+ " = "+total);
	scan.close();
	}


	}


