package day12_nestedLoop;

public class homeWork_review {

	public static void main(String[] args) {
//		
//		do {
//			i++;
//			if (i % 3 == 0 && i % 5 == 0) {
//				System.out.print(" FINRA ");
//			} else if (i % 3 == 0) {
//				System.out.print(" FIN ");
//			} else if (i % 5 == 0) {
//				System.out.print(" RA ");
//			} else {
//				System.out.print(" "+i+" ");
//			}
//		} while (i < 100);
           //with "for":
		for(int i=1; i<101;i++) {
			System.out.print(i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(" FINRA ");
			} else if (i % 3 == 0) {
				System.out.print(" FIN ");
			} else if (i % 5 == 0) {
				System.out.print(" RA ");
			} else {
				System.out.print(" "+i+" ");
			}
			
		
		}


