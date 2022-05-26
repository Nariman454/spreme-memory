package day06_controlFlow;

public class ifStatement {

	public static void main(String[] args) {
     //Decision making statements
		//if statement And switch case
		//Syntax:
		/*
		 * if(condition){
		 *    statement1
		 *    }else{
		 *    statement 2
		 *    }
		 */
		int a = 15;
		int b = 7; 
		if (a>b) { //5>7
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		int count = 12;
		int total = 4;
		if (count<3) {
			total=0;
		}else {
			total = total+count;
		}
		System.out.println(total);
		}
		
	

}
