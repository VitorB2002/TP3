package tp3;

public class Pelicula extends Produto{
	
	private String material;
	private double espessura;
	private String celularCompativel;
	
	//Getters e Setters
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public double getEspessura() {
		return espessura;
	}
	
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	
	public String getCelularCompativel() {
		return celularCompativel;
	}
	
	public void setCelularCompativel(String celularCompativel) {
		this.celularCompativel = celularCompativel;
	}
	
}
