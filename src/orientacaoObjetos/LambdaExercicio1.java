package orientacaoObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class LambdaExercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de funcion�rios: ");
		int qtde = sc.nextInt();
		sc.nextLine();
		int id[] = {0};
		List<Funcionario> list = new ArrayList<>();
		Funcionario result;
		for (int i = 0; i < qtde; i++) {
			System.out.println("Informe o id do funcion�rio: ");
			id[0] = sc.nextInt();
			result = list.stream().filter(x -> x.getId() == id[0]).findFirst().orElse(null);
			while (result != null) {
				System.out.println("Este id j� existe, informe outro: ");
				id[0] = sc.nextInt();
				result = list.stream().filter(x -> x.getId() == id[0]).findFirst().orElse(null);
			}
			sc.nextLine();
			System.out.println("Informe o nome do funcion�rio: ");
			String nome = sc.nextLine();
			System.out.println("Informe o sal�rio do funcion�rio: ");
			double salario = sc.nextDouble();
			sc.nextLine();
			list.add(new Funcionario(id[0], nome, salario));
		}
		System.out.println("Informe o id do funcion�rio que ter� aumento: ");
		id[0] = sc.nextInt();
		result = list.stream().filter(x -> x.getId() == id[0]).findFirst().orElse(null);
		while (result == null) {
			System.out.println("Este id n�o existe, informe outro: ");
			id[0] = sc.nextInt();
			result = list.stream().filter(x -> x.getId() == id[0]).findFirst().orElse(null);
		}
		System.out.println("Informe o percentual de aumento: ");
		double percentual = sc.nextDouble();
		result.AumentaSalario(percentual);
		for (Funcionario x : list) {
			System.out.println(x.toString());
		sc.close();
		}
	}
}