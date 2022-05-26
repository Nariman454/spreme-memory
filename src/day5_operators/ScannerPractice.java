package day5_operators;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner irfan = new Scanner(System.in);
		System.out.println("Please type value a");
		int a = irfan.nextInt();
		System.out.println("Please type value b");
		int b = irfan.nextInt();
		System.out.println("Please type value c");
		int c = irfan.nextInt();
		
		System.out.println(a+b>c);
irfan.close();
	}

}
