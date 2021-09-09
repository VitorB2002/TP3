package tp3;

public class Pelicula extends Produto{
	
	private String material;
	private Double espessura;
	private String celularCompativel;
	
	//Getters e Setters
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Double getEspessura() {
		return espessura;
	}
	
	public void setEspessura(Double espessura) {
		this.espessura = espessura;
	}
	
	public String getCelularCompativel() {
		return celularCompativel;
	}
	
	public void setCelularCompativel(String celularCompativel) {
		this.celularCompativel = celularCompativel;
	}
	
}
