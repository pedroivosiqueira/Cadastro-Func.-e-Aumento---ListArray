package entities;

public class Employee {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Employee(Integer id, String name, Double salario) {
		this.id = id;
		this.nome = name;
		this.salario = salario;
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
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}		
	
	public void increaseSalary(double percent) {
		salario += salario * percent / 100;
	}
	
	public String toString() {
		return id
			+ ", "
			+ nome
			+ ", "
			+ String.format("%.2f", salario);
	}
}
