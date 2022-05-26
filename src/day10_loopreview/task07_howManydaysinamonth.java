package day10_loopreview;

public class task07_howManydaysinamonth {

	public static void main(String[] args) {
//		String month = "January";
//		if (month == "January") {System.out.println("January has 31 days");}
//		if (month == "February") {System.out.println("February has 28 days");}
//		if (month == "March") {System.out.println("March has 31 days");}
//		if (month == "April") {System.out.println("April has 30 days");}
//		if (month == "May") {System.out.println("May has 31 days");}
//		if (month == "June") {System.out.println("June has 30 days");}
//		if (month == "July") {System.out.println("July has 31 days");}
//		if (month == "August") {System.out.println("August has 31 days");}
//		if (month == "September") {System.out.println("September has 30 days");}
//		if (month == "October") {System.out.println("October has 31 days");}
//		if (month == "November") {System.out.println("November has 30 days");}
//		if (month == "December") {System.out.println("December has 31 days");}
		
		int month = 4;
		int days =0;
//		if(month==1) {days = 31;}
//		else if (month ==2) {days =28;}
//		else if (month ==3) {days =31;}
//		//...
//		
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12: 
//			days = 31;
//			break;
//		case 2:
//			days = 28;
//			break;
//				default: days=30;
//		}
		if (month ==1 || month==3 || month==5 ||month==7 ||month==8||month==10||month==12) {
			System.out.println("Has 31 days");
		if (month==2) {System.out.println("Has28 days");}
		if (month ==4||month==6||month==9||month==11) {
			System.out.println("Has 30 days");
		}
		
		}
		
	}

}
