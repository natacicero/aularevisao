package aularevisao;

public class Cliente {

	public Cliente(String nome, String rg, String cpf, double sal�rio) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sal�rio = sal�rio;
	}
	private String nome;
	private String rg;
	private String cpf;
	private double sal�rio;
	
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
	public double getSal�rio() {
		return sal�rio;
	}
	public void setSal�rio(double sal�rio) {
		this.sal�rio = sal�rio;
	}
	
	
	
	
}
