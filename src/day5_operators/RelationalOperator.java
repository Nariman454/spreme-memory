package day5_operators;

public class RelationalOperator {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(b==c);
		boolean result =a<b;
		System.out.println(result);
		result = a==b; //false
		System.out.println(result);
		System.out.println(a!=b);
		result = a+b==c;
		System.out.println(result);
		System.out.println(a*b>=c);
		result = a+b<=c; //3<=3
		System.out.println(result);

	}

}
