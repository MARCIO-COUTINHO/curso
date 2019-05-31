package curso;

public class OrdemDaSoma {

	public static void main(String[] args) {
		
		int a = 10;
		a++;
		System.out.println(a);
		System.out.println("-----------------------");
		
		a = 10;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------------");
		
		a = 10;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
	}

}
