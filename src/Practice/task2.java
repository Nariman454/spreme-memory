package Practice;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// Create a program to print out the name of the group based on the age provided
		Scanner ageGroup = new Scanner(System.in);
		System.out.println("Please enter Age:");
		int age = ageGroup.nextInt();
		if (age>0 && age<2) {System.out.println("Infancy");}
		else if (age>=2 && age<=4) {System.out.println("Toddler");}
		else if (age>4 && age<=7) {System.out.println("Early school age");}
		else if (age>7 && age<=12) {System.out.println("Middle school age");}
		else if (age>12 && age<=17) {System.out.println("Early adolescence");}
		else if (age>17 && age<=25) {System.out.println("Later adolescence");}
		else if (age>25 && age<=30) {System.out.println("Early adulthood");}
		else if (age>30 && age<=50) {System.out.println("Middle adulthood");}
		if (age>50) {System.out.println("Later adulthood");}
		
		ageGroup.close();
		

	}

}
