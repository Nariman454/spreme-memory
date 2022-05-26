import java.util.Scanner;

public class bathTemp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your temperature:");
        int bt = scan.nextInt();
		if (bt<90); {
			System.out.println("Brrr!");}
		if (bt>90 && bt<95); {
			System.out.println("That's lukewarm.");}
		if (bt>=95 && bt<=105); 
		   {System.out.println("Perfect!");}
		if (bt>=105 && bt<=110) {
			System.out.println("This isn't ahot tub");}
		if (bt>110) {
			System.out.println("Are you trying to boil a lobster?");}
		scan.close();

	}
	

}
