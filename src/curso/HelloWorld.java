package curso;

import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		boolean completed = false;
		char gender = 'F';
		char letter = '\u0041';
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L;
		float n5 = 4.5f;
		double n6 = 4.5;

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello world!");
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		String name = "Maria Green";
		System.out.println(name);
		Object obj1 = "Alex Brown";
		System.out.println(obj1);
		Object obj2 = 4.5f;
		System.out.println(obj1);
		sc.close();
		
		double a;
		float b;
		a = 5.0;
		b = (float)a;
		System.out.println(b);
		
		double c;
		int d;
		c = 5.0;
		d = (int)c;
		System.out.println(d);
		
		int e, f;
		double result;
		e = 5;
		f = 2;
		result = (double) e / f;
		System.out.println(result);
		
		int age = 32;
		double balance = 10.35784;
		System.out.print("Good morning!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("---------------------------");
		System.out.println(balance);
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balance);
		System.out.println("---------------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age,
		gender, balance);
	}

}
