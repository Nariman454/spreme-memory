package day12_nestedLoop;

import java.util.Scanner;

public class timerNextLevel {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("How long to wait? ");
		int waitTime = scan.nextInt();
		System.out.println(waitTime + " minute timer started!");
		for (int i = waitTime - 1; i >= 0; i--) {

			for (int s = 59; s >= 0; s--) {
				System.out.println(i + " : " + s);
				Thread.sleep(1000);
			}
		}
		System.err.println("Time's UP!!!");
	}
}
