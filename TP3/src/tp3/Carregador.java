package tp3;

public class Carregador extends Produto {
	
	private double tamanhoCabo;
	private double potencia;
	
	//Constructor
	
	public Carregador(String modelo, String descricao, double valor, String marca, double tamanhoCabo, double potencia) {
		this.modelo = modelo;
		this.descricao = descricao;
		this.valor = valor;
		this.marca = marca;
		this.tamanhoCabo = tamanhoCabo;
		this.potencia = potencia;
	}
	
	//Getters e Setters
	
	public double getTamanhoCabo() {
		return tamanhoCabo;
	}
	
	public void setTamanhoCabo(double tamanhoCabo) {
		this.tamanhoCabo = tamanhoCabo;
	}
	
	public double getPotencia() {
		return potencia;
	}
	
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
}
