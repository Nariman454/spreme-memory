package day13_String;

public class String_findIndexOf {

	public static void main(String[] args) {
		          //  012345678901234567890123456
		String name ="President George Washington";
		name.indexOf('p');       //0
		name.indexOf('e');       //2   
		name.indexOf("George");  //10 
		name.indexOf('e',3);     //6
		name.indexOf("Bob");     //-1  
		name.indexOf('e');       //15
		System.out.println(name.indexOf('P'));
		System.out.println(name.charAt(8));
		System.out.println(name.charAt(9));
		System.out.println(name.charAt(10));
		System.out.println(name.indexOf('p'));
		System.out.println(name.indexOf('e',3));
		System.out.println(name.indexOf('e',9));
		System.out.println(name.lastIndexOf("George"));
		System.out.println(name.lastIndexOf("rge"));
		System.out.println(name.indexOf("Bob"));
		System.out.println(name.indexOf("George")>-1);
		System.out.println(name.indexOf("Bob")>-1);
		
		

	}

}
