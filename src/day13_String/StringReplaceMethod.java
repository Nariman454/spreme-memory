package day13_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
		String word = "car";
		word = word.replace('r','t');
		System.out.println(word); 
		String srt = "tomato";
		System.out.println(srt);
		srt = srt.replace('t', 'p');
		System.out.println(srt);
		String srt2 = "tomato";
		System.out.println(srt2);
		srt2 = srt2.replace("to", "MO");
		System.out.println(srt2);
		String str3 ="How Turkey spoiled NATO's historic moment with Finland, Sweden";
		str3 = str3.replace("Turkey","India");
		System.out.println(str3);
		str3 = str3.replace(" ","");
		System.out.println(str3);
		String word2 = "Hello TechCircle";
		word2 = word2.replace("TechCircle", "Iran");
		System.out.println(word2);
		
	}

}
