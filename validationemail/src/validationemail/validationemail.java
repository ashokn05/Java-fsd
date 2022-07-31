package validationemail;

import java.util.regex.*;
import java.util.*;
import java.util.Scanner;

public class validationemail {
	public static void main(String args[]) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("abcd@gmail.com");
		emails.add("efgh@gmail.com");
		emails.add("ijkl@gmail.com");
		emails.add("mnop@gmail.com");
		emails.add("qrst@gmail.com");
		emails.add("uvwx@gmail.com");

		emails.add("@edu.com");
		emails.add("2233gmailcom");
		String validationemail = null;
		
		System.out.println("Enter the email to search");
		Scanner sc = new Scanner(System.in);
		
		validationemail = sc.nextLine();

		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {

			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches() + "\n");
		}
	}
}