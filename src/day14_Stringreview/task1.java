package day14_Stringreview;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
//		//## Task1
//		`write a program that asks user to enter a sentence.
//        then print the first & last characters of the sentence
//Example:
//Input: Welcome To TechCircle
//output: We
		
		String s = "Welcome to Techcircle!";
		char firstChar = s.charAt(0);
		char lastChar = s.charAt(s.length()-1);
		System.out.println(firstChar);
		System.out.println(lastChar);
		String result = ""+firstChar;
		System.out.println(result);
		result+=lastChar;
		System.out.println();

	}

}
