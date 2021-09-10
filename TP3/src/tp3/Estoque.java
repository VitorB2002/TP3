package tp3;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Capa> capas = new ArrayList<>();
	private ArrayList<Carregador> carregadores = new ArrayList<>();
	private ArrayList<Pelicula> peliculas = new ArrayList<>();
	private ArrayList<Fone> fones = new ArrayList<>();
	private int qtdCarregador = 0;
	private int qtdPelicula = 0;
	private int qtdCapa = 0;
	private int qtdFone = 0;
	
	public Estoque() {
		
	}
	
	public void relatorioProdutos(int qtdCarregador, int qtdPelicula, int qtdCapa, int qtdFone, int vendas) {
		String saida;
		int qtdProduto = qtdCarregador + qtdPelicula + qtdCapa + qtdFone;
		saida = "\nCarregadores registrados: " + qtdCarregador;
		saida += "\nPeliculas registradas: " + qtdPelicula;
		saida += "\nCapas registradas: " + qtdCapa;
		saida += "\nFones registrados: " + qtdFone;
		saida += "\nTotal de produtos: " + qtdProduto;
		saida += "\nVendas realizadas: " + vendas;
		System.out.println(saida);
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

	public int getQtdCarregador() {
		return qtdCarregador;
	}

	public void setQtdCarregador(int qtdCarregador) {
		this.qtdCarregador = qtdCarregador;
	}

	public int getQtdPelicula() {
		return qtdPelicula;
	}

	public void setQtdPelicula(int qtdPelicula) {
		this.qtdPelicula = qtdPelicula;
	}

	public int getQtdCapa() {
		return qtdCapa;
	}

	public void setQtdCapa(int qtdCapa) {
		this.qtdCapa = qtdCapa;
	}

	public int getQtdFone() {
		return qtdFone;
	}

	public void setQtdFone(int qtdFone) {
		this.qtdFone = qtdFone;
	}
	
	
	
}
