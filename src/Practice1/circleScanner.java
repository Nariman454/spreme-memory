package Practice1;

import java.util.Scanner;

public class circleScanner {

	public static void main(String[] args) {
		Scanner circle = new Scanner(System.in);
		System.out.println("Please enter r:");
		double r = circle.nextDouble();
		double p = 3.14;
		double S = (r*r*p);
		System.out.println("the area of the circle is "+" "+S);
		circle.close();
		
	}

		
	}


