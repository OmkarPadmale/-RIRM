package assignment;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Input:");
		String input = sc.next();
		if (input.startsWith("https") || input.startsWith("http")) {
			String socialLink1, socialLink2, email;
			String contact = "+1 343 303 6668";

			int index = input.indexOf(":");

			socialLink1 = input.substring(0, index + 1) + "//www.facebook.com/";

			String sl1 = socialLink1.concat(input.substring(index + 3, input.length()).replace(".", ""))
					.concat("Tech/");

			socialLink2 = input.substring(0, index + 1).concat("//www.linkedin.com/company/");
			String sl2 = socialLink2.concat(input.substring(index + 3, input.length()).replace(".", "-")).concat("/");

			email = "support@";
			String e = email.concat(input.substring(index + 3, input.length()));
			System.out.println("Social links -\n" + sl1 + "\n" + sl2 + "\n\n" + "Email/s-\n" + e + "\n\n" + "Contact:\n"
					+ contact);

		} else {
			System.out.println("Invalid String");

		}

	}
}
