package tp3;

public class Capa extends Produto {
	
	private String material;
	private String celularCompativel;
	private double peso;
	private String cor;
	
	//Getters e Setters
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getCelularCompativel() {
		return celularCompativel;
	}
	
	public void setCelularCompativel(String celularCompativel) {
		this.celularCompativel = celularCompativel;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
