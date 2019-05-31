package orientacaoObjetos;

import java.util.Scanner;

import entities.ContaBancaria;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Entre o Nome: ");
		String nome = sc.next();
		System.out.println("Entre o deposito Inicial: ");
		ContaBancaria contaBancaria = new ContaBancaria(numero, nome);
		contaBancaria.deposito(sc.nextDouble());
		contaBancaria.setNumero(numero);
		contaBancaria.setNome(nome);
		System.out.println("Entre com deposito: ");
		contaBancaria.deposito(sc.nextDouble());
		System.out.println("Entre com a retirada: ");
		contaBancaria.retirada(sc.nextDouble());
		System.out.printf("Saldo atual: %.2f%n", contaBancaria.getSaldo());
		sc.close();
	}
}
