package day5_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// &&,||,!
		// && AND
		/*
		 * Condition A Condition B Result
		 *     t           t        t
		 *     t           f        f
		 *     f           t        f
		 *     f           f        f
		 */
		int a=10;
		int b=5;
		int c=15;
		boolean conditionA = a+b==c;
		boolean conditionB = c-b==a;
		System.out.println(conditionA && conditionB);
		System.out.println((a+b==c)&&(c-b==a));
		conditionA = c/b>=3; //true
		conditionB = a+b>c;  //false
		boolean result = conditionA && conditionB;
		System.out.println(result);
		
		String userName = "techcircle";
		String passWord = "abc123";
		System.out.println(userName=="techcircle" && passWord =="abc123");
		System.out.println(userName=="eyyman" && passWord =="abc123");
		
		// ,||,OR
				
				/*
				 * Condition A Condition B Result
				 *     t           t        t
				 *     t           f        t
				 *     f           t        t
				 *     f           f        f
				 */
		a=1;
		b=2;
		c=3;
		//         1+2==3
		conditionA=a+b==c; //true
		conditionB=a-b> c; //false
		System.out.println(conditionA || conditionB);
		System.out.println(true || true);  //true
		System.out.println(true || false); //true
		System.out.println(false|| true); //true
		System.out.println(false|| false); //false
		System.out.println(conditionA || c/a==3);
		System.out.println(c+a<b+a || a<5);
		//Logical not !
		/*
		   !true==false
		   !false==true
		 */
		conditionA=true;
		conditionB=false;
		System.out.println(!conditionA);
		System.out.println(!conditionB);
	}

}
