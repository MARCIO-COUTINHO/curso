package curso;

import java.util.Locale;
import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
//		Enter your full name:
//			Alex Green
//			How many bedrooms are there in your house?
//			3
//			Enter product price:
//			500.50
//			Enter your last name, age and height (same line):
//			Green 21 1.73		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine(); // marcio coutinho
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt(); // 3
		System.out.println("Enter product price:");
		double price = sc.nextDouble(); //500.00
		System.out.println("Enter your last name, age and height (same line)");
		String lastName = sc.next(); // coutinho
		int age = sc.nextInt(); // 63
		double height = sc.nextDouble(); // 1.74
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(height);
		sc.close();
	}

}
