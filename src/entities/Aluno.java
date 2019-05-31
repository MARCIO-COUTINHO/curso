package entities;

public class Aluno {
	
	String nome;
	String email;
	double aluguel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	public Aluno(String nome, String email, double aluguel) {
		this.nome = nome;
		this.email = email;
		this.aluguel = aluguel;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", aluguel=" + aluguel + "]";
	}
}
