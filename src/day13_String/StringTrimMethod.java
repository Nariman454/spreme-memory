package day13_String;

public class StringTrimMethod {

	public static void main(String[] args) {
		String str1 = "       hello";
		System.out.println(str1.length());
		System.out.println(str1);
		str1 = str1.trim(); //remove the blank spaces
		System.out.println(str1.length()); //5
		System.out.println(str1);
		
		String str2 = "                                 eeeeyy man                  ";
		System.out.println(str2.length());
		str2 = str2.trim();
		System.out.println(str2);
		
		String name ="President George Washington";
		System.out.println(name.length());
		name = name.trim();
		System.out.println(name); // won't trim shit. only good to remove space before
		// or after
		
		
		
		
	}

}
