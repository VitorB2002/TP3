package tp3;

public class Fone extends Produto {
	
	private double peso;
	private String tipoConexao;
	private boolean filtroRuido;
	private String cor;
	private String materialBorracha;
	
	//Getters e Setters
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getTipoConexao() {
		return tipoConexao;
	}
	
	public void setTipoConexao(String tipoConexao) {
		this.tipoConexao = tipoConexao;
	}
	
	public boolean isFiltroRuido() {
		return filtroRuido;
	}
	
	public void setFiltroRuido(boolean filtroRuido) {
		this.filtroRuido = filtroRuido;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMaterialBorracha() {
		return materialBorracha;
	}
	
	public void setMaterialBorracha(String materialBorracha) {
		this.materialBorracha = materialBorracha;
	}
	
}
