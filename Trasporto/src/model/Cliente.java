package model;

public class Cliente {
    private String nome;
    private String CPF;
    private String RG;
    private Caminhoneiro c1;
    private Viagem viagem1;
    private Carreta carreta1;
    
    public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public Caminhoneiro getC1() {
		return c1;
	}

	public void setC1(Caminhoneiro c1) {
		this.c1 = c1;
	}

	public Viagem getViagem1() {
		return viagem1;
	}

	public void setViagem1(Viagem viagem1) {
		this.viagem1 = viagem1;
	}

	public Carreta getCarreta1() {
		return carreta1;
	}

	public void setCarreta1(Carreta carreta1) {
		this.carreta1 = carreta1;
	}

	public void visualizarViagem() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Nome do caminhoneiro: " + this.c1.getNome());
        System.out.println("Nome do veículo: " + this.carreta1.getModeloCarreta());
        System.out.println("Destino da viagem: " + this.viagem1.getDestino());
        System.out.println("Valor do quilômetro: " + this.viagem1.getValorKM() + "  Distância percorrida: " + this.viagem1.getDistancia());
        System.out.println("Valor total da viagem: " + this.viagem1.getValorViagem());
    }
}