package day13_String;

public class getdomainName {

	public static void main(String[] args) {
		// help.walmart.com
		//help@aws.com
		//help@uscis.gov
		//help@github.com
		//              0123456789012345
		String email = "help@uscis.com";
		System.out.println(email.indexOf('@'));
		System.out.println(email.indexOf('.'));
		System.out.println(email.substring(4+1,12));
		int startingIndex = email.indexOf('@')+1;
		int endingIndex = email.indexOf('.');
		String domainName = email.substring(startingIndex, endingIndex);
		System.out.println(domainName);

	}

}
