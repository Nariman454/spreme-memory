package day12_nestedLoop;

public class factorial {

	public static void main(String[] args) {
		int result = 5;
		for(int i=5; i>=1; i--) {
//         System.out.println(i);
         result=result*i;
	}
		System.out.println(result);
	}
}
