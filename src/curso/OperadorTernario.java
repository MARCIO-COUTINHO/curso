package curso;

public class OperadorTernario {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		System.out.println(desconto);
		
		double preco1 = 34.5;
		double desconto1 = (preco1 < 20.0) ? preco1 * 0.1 : preco1 * 0.05;
		System.out.println(desconto1);
	}

}
