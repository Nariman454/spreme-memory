package Practice;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// Create a program to find out students' grade and GPA.
		Scanner grade = new Scanner(System.in);
		System.out.println("Please enter score:");
		int s = grade.nextInt();
		if (s>=97 && s<=100) {System.out.println("A+ , 4.0");}
		if (s<97 && s>=93) {System.out.println("A , 3.9");}
		if (s<93 && s>=90) {System.out.println("A- , 3.7");}
		if (s<90 && s>=87) {System.out.println("B+ , 3.3");}
		if (s<87 && s>=83) {System.out.println("B , 3.0");}
		if (s<83 && s>=80) {System.out.println("B- , 2.7");}
		if (s<80 && s>=77) {System.out.println("C+ , 2.3");}
		if (s<77 && s>=73) {System.out.println("C , 2.0");}
		if (s<73 && s>=70) {System.out.println("C- , 1.7");}
		if (s<70 && s>=67) {System.out.println("D+ , 1.3");}
		if (s<67 && s>=63) {System.out.println("D , 1.0");}
		if (s<63 && s>=60) {System.out.println("D- , 0.7");}
		if (s>0 && s<=59) {System.out.println("F , 0.0");}
			
		
		grade.close();

	}

}
