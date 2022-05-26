package day06_controlFlow;

public class Grades {


	public static void main(String[] args) {
		int score = 64;
		String grade = "";
		double gpa = 0;
		if (score>=0 && score<=100){
			if (score>=97 &&score<=100) {
				grade = "A+";
		        gpa = 4.0;
			}
		    if (score<97 && score>=93) {
		    	grade = "A";
		    	gpa = 3.9;
			}
		    if (score<93 && score>=90) {
		    	grade = "A-";
		    	gpa = 3.7;
		    }
		    if (score<90 &&score>=87) {
				grade = "B+";
		        gpa = 3.3;
		    }
		    if (score<87 &&score>=83) {
				grade = "B";
		        gpa = 3.0;
		    }
		    if (score<83 &&score>=80) {
				grade = "B-";
		        gpa = 2.7;
		    }
		    if (score<80 &&score>=77) {
				grade = "C+";
		        gpa = 2.3;
		    }
		    if (score<77 &&score>=73) {
				grade = "C";
		        gpa = 2.0;
		    }
		    if (score<73 &&score>=70) {
				grade = "C-";
		        gpa = 1.7;
		    }
		    if (score<70 &&score>=67) {
				grade = "D+";
		        gpa = 1.3;
		    }
		    if (score<67 &&score>=63) {
				grade = "D";
		        gpa = 1.0;
		    }
		    if (score<63 &&score>=60) {
				grade = "D-";
		        gpa = 0.7;
		    }
		    if (score<60 &&score>=0) {
				grade = "F";
		        gpa = 0.0;
		    }
		}else {
			System.out.println("Invalid score");
		}
		System.out.println(grade);
		System.out.println(gpa);

	}

}
