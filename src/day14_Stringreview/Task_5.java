package day14_Stringreview;

public class Task_5 {

	public static void main(String[] args) {
		/*## Task5
`Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
		str1 = "test@example.com" --> true
		str2 = "test@example.co.in --> true
        str3 = "@example.com" --> false*/
		String email = "test@example.com";
		boolean hasAtsign = email.contains("@");
		System.out.println(hasAtsign);
		boolean hasDot = email.contains(".");
		
		boolean hasCharBeforeAt = email.indexOf('@')>1;
		System.out.println(hasCharBeforeAt);
		
		boolean dotAndatAreInAppropriatePlaces = email.lastIndexOf('.')-email.indexOf('@')>=2;
		if(hasAtsign && hasDot && hasCharBeforeAt && dotAndatAreInAppropriatePlaces) {
			System.out.println("valid");}
		else {System.out.println("Invalid");
		}
		
	}

}
