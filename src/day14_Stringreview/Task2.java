package day14_Stringreview;

public class Task2 {

	public static void main(String[] args) {
//		//Create a class called Reverse, write a program that will reverse a string.
//	    Your program should reverse a string only 5 characters long.
//	    If word is shorter, display message: "Too short!".
//	    If word is longer, display message: "Too long!".
//	    Otherwise, reverse this word and print out result into the console
//		String str = "Hello";
//		int a = str.length();
//		if (a == 5) {
//			String str1 = str.replace(str.charAt(0), (str.charAt(5)));
//			String str2 = str.replace(str.charAt(1), (str.charAt(4)));
//			String str3 = str.replace(str.charAt(2), (str.charAt(3)));
//			System.out.println(str1 + str2 + str3);
//		} else if (a < 5) {
//			System.out.println("Too short");
//		} else if (a > 5) {
//			System.out.println("Too long");
//		}  didn't work!!
		
		String str = "Pizza";
		if (str.length()==5) {
//			System.out.print(str.charAt(4));
//			System.out.print(str.charAt(3));
//			System.out.print(str.charAt(2));
//			System.out.print(str.charAt(1));
//			System.out.print(str.charAt(0));
			for (int i = str.length()-1; i>=0; i--) System.out.print(str.charAt(i));
		
		}else {
			if (str.length()>5) System.out.println("Too long!");
		}

	}

}
