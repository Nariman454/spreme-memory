package day13_String;

public class StringContainsMethod {

	public static void main(String[] args) {
		String name ="President George Washington";
		System.out.println(name.contains("Washington"));
		System.out.println(name.indexOf("Washington")>-1); //same as line 7.
		System.out.println(name.indexOf("George")>-1);
		System.out.println(name.indexOf("Bob")>-1);

	}

}
