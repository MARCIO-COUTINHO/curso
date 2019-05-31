package orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de estudantes: ");
		int n = sc.nextInt();
		sc.nextLine();
		Aluno[] alunos = new Aluno[10];
		int i = 0;

		for (i = 0; i < n; i++) {
			System.out.println("Informe o nome: ");
			String nome = sc.nextLine();
			System.out.println("Informe o email: ");
			String email = sc.nextLine();
			System.out.println("Informe o aluguel: ");
			double aluguel = sc.nextDouble();
			System.out.println("Informe o quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			while ((quarto < 0) || (quarto > 10)) {
				System.out.println("Quarto deve ser 0 a 9");
				quarto = sc.nextInt();
			}
			while (alunos[quarto] != null) {
				System.out.println("O quarto " + quarto + " já está ocupado, escolha outro de 0 a 9");
				quarto = sc.nextInt();
				sc.nextLine();
			}
			alunos[quarto] = new Aluno(nome, email, aluguel);
		}
		for (i = 0; i < 10; i++) {
			if (alunos[i] != null)
				System.out.println("Quarto " + i + " " + alunos[i].toString());
		}
		sc.close();
	}

}
