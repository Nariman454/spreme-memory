package day14_Stringreview;

public class Numbertostring {

	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		System.out.println(a+b); //200
		String valueA = "";
		String valueB = "";
		
		System.out.println(valueA.length());
		System.out.println(valueB.length());
		valueA=valueA+a; //100 as string
		System.out.println(valueA.length()); //3
		System.out.println(valueA.charAt(0));
		System.out.println(valueA.charAt(1));
		System.out.println(valueA.charAt(2));
		
		valueB += b;
		
		System.out.println(valueB); //100
		System.out.println(valueA+valueB);
		

	}

}
