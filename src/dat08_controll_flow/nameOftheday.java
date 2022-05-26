package dat08_controll_flow;

public class nameOftheday {
    //using else if instead of only several ifs makes program more efficient, as all "else if"
	//considered conditions of first if statement. it'll be faster.
	public static void main(String[] args) {
	int day=3;
	if (day==1) {System.out.println("monday");}
	else if (day==2) {System.out.println("Tuesday");}
	else if (day==3) {System.out.println("Wednesday");}
	else if (day==4) {System.out.println("Thursday");}
	else if (day==5) {System.out.println("Friday");}
	else if (day==6) {System.out.println("Saturday");}
	else if (day==7) {System.out.println("Sunday");}
	}

}
