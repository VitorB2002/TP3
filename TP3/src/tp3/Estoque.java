package tp3;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Capa> capas = new ArrayList<>();
	private ArrayList<Carregador> carregadores = new ArrayList<>();
	private ArrayList<Pelicula> peliculas = new ArrayList<>();
	private ArrayList<Fone> fones = new ArrayList<>();
	private int qtdProduto = 0;
	
	public Estoque() {
		
	}
	
	public void relatorioProdutos(int qtdProduto) {
		
	}
	
	//Getters e Setters
	
	public ArrayList<Capa> getCapas() {
		return capas;
	}
	
	public void setCapas(Capa capa) {
		capas.add(capa);
	}
	
	public ArrayList<Carregador> getCarregadores() {
		return carregadores;
	}
	
	public void setCarregadores(Carregador carregador) {
		carregadores.add(carregador);
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void setPeliculas(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
	public ArrayList<Fone> getFones() {
		return fones;
	}
	
	public void setFones(Fone fone) {
		fones.add(fone);
	}
	
	public int getQtdProduto() {
		return qtdProduto;
	}
	
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
}
