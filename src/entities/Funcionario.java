package entities;

public class Funcionario {

	Integer id;
	String nome;
	Double Salario;
	
	public Funcionario() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return Salario;
	}
	public void AumentaSalario(Double percentual) {
		Salario = Salario + Salario * percentual / 100.0;
	}
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		Salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", Salario=" + Salario + "]";
	}

}
