package day4_operator;

public class TypeCasting {
public static void main(String[] args) {
	int a=10;
	double b=a;
	System.out.println(a);
	System.out.println(b);
	long c=7000000L;
	float d=c;
		System.out.println(d);
		
		int valueA=10;
		byte valueV=(byte)valueA;
		System.out.println(valueA);
		System.out.println(valueV);
		
		int valueC = 300;
		byte valueD= (byte)valueC; //byte -->-128-127
		System.out.println(valueD);
		double e=40000;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		short f = (short)e;//will lose some value
		
	System.out.println(f);
	double h=f;
	System.out.println(h);
	//%
	int A = 10;
	int B = 3;
	System.out.println(A/B);
	System.out.println(A%B);   //(3,3,3,1)
	System.out.println(10%4);  //(4 , 4 , 2) % will print the 2
	System.out.println(10%5);  //(5,5,0) % will print 0
	System.out.println(11%2);  //
	System.out.println(99%2 ==1);
	System.out.println(500%2==0);
	System.out.println(13%2==0);	
}

}
