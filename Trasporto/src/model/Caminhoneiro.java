package model;

public class Caminhoneiro {
    private String nome;
    private String cnpj;
    private String cpf;
    private double salario;
    
    public Caminhoneiro(String nome, String cnpj, String cpf) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}