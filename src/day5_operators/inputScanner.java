package day5_operators;

import java.util.Scanner;

public class inputScanner {

	public static void main(String[] args) {
		//create instance of scanner object
		Scanner s = new Scanner(System.in);
		
		System.out.println("please input number A");
		//int a=20;
		int a =s.nextInt();
		System.out.println("please input number B");
		//int b=20;
		int b = s.nextInt();
		int result = a + b;
		
		System.out.println(result);
		s.close();
	}

}
