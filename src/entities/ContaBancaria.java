package entities;

public class ContaBancaria {

	private int numero;
	private String nome;
	private double saldo;
	
	public int getNumero() {
	return numero;
	}

	public ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public ContaBancaria(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public void setNumero(int numero) {
		if (this.numero == 0) {
			this.numero = numero;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void deposito(double valor) {
		this.saldo = saldo += valor;
	}

	public void retirada(double valor) {
		this.saldo = saldo - valor - 5;
	}

	public double getSaldo() {
		return saldo;
	}
}