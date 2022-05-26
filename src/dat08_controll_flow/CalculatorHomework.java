package dat08_controll_flow;

public class CalculatorHomework {

	public static void main(String[] args) {
		double numA = 5;
		double numB = 10;
		String operator ="/";
		double total = 0;
		
		if (operator=="+") { total = numA+numB;}
		if (operator=="-") { total = numA-numB;}
		if (operator=="*") { total = numA*numB;}
		if (operator=="/") { total = numA/numB;}
		System.out.println(numA + " "+ operator + " "+numB+ " = "+total);
	}

}
