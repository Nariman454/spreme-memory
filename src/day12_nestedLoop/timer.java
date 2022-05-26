package day12_nestedLoop;

public class timer {

	public static void main(String[] args) throws InterruptedException {
		// Timer
		for (int m = 1; m>=0; m--) {
			
			for (int s = 59; s>=0; s--)
			{System.out.println(m+ " : "+s);
			Thread.sleep(1000);}
		}
	}

}
