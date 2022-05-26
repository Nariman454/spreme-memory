package day10_loopreview;

public class MultilpicationTable {

	public static void main(String[] args) {
		int num = 5;
		/*
		 * 1x5 = 5
		 * 2x5 = 10
		 * 
		 * 10x5= 50
		 */
       for (int i = 1; i<=10; i++) {
    	   int total = i*num;
    	 //  System.out.println(total);
    	 //  System.out.println(i+"X"+num+ "="+total);
    	  System.out.printf("%d X %d = %d",i, num,i*num);
    	  System.out.println();
    	   
       }
	}

}
