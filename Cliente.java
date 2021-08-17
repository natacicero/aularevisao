package aularevisao;

public class Cliente {

	public Cliente(String nome, String rg, String cpf, double salário) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.salário = salário;
	}
	private String nome;
	private String rg;
	private String cpf;
	private double salário;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;
	}
	
	
	
	
}
