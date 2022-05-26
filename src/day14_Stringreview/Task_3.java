package day14_Stringreview;

public class Task_3 {

	public static void main(String[] args) {
		/*
		 * write a program that asks user to enter two strings, and print out the
		 * longest string
		 */
		String str1 = "hey man";
		String str2 = "eyyyyy";

		if (str1.length() > str2.length()) {
			System.out.println(str1);
		} else {
			System.out.println(str2);
		}
	}

}
