package curso;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(sentence);
		
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = sc.next();
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}

}
