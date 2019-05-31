package curso;

import java.util.Scanner;

public class MaiorDeTresNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3= sc.nextInt();
		int max;
		
		if (n1 > n2) {
			max = n1;
		}
		
		if (n2 > n3) { 
			max = n2;
		}
		else {
			max = n3;
		}
		
		System.out.println(max);

		sc.close();

	}

}
