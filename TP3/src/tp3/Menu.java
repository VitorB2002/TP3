package tp3;

import java.util.ArrayList;

public class Menu {
	
	public static void main(String[] args) {
		
		int qtdProduto = 0, qtdCarregador = 0, qtdPelicula = 0, qtdCapa = 0, qtdFone = 0;
		
		Estoque estoqueCapas = new Estoque();
		Estoque estoqueCarregadores = new Estoque();
		Estoque estoquePeliculas = new Estoque();
		Estoque estoqueFones = new Estoque();
		
		Venda v;
		Carregador car = new Carregador("Usb - c", "Carregador voltado para celulares com plug c", 15.5, "Inova", 100, 2.5);
		Pelicula peli = new Pelicula("3D", "Película protetora anti-impacto", 30.0, "nanoshield", "Vidro", 0.5, "Samsung A8");
		Capa cap = new Capa("Anti-Impacto", "Capa anti-impacto para evitar acidentes", 20, "Incase", "Silicone2", "J7 e J5", 1.98, "Azul");
		Capa cap2 = new Capa("Anti-Impacto", "Capa anti-impacto para evitar acidentes", 20, "Incase", "Silicone", "J7 e J5", 1.98, "Azul");
		Fone fon = new Fone("Headset", "Fone de qualidade", 50.0, "TWS", 0.500, "bluetooth", true, "Vermelho", "Silicone");
		Cliente cliente1 = new Cliente("Cleiton", "0549258234921", "Vila Mimosa", "cleiton@gmail2000.com", "61992341041");
		
		estoqueCapas.setCapas(cap);
		qtdCapa++;
		estoqueCapas.setCapas(cap2);
		qtdCapa++;
		estoqueCarregadores.setCarregadores(car);
		
		estoquePeliculas.setPeliculas(peli);
		estoqueFones.setFones(fon);
		
		System.out.println(estoqueCapas.getCapas().get(0).toString());
		System.out.println("\n");
		System.out.println(estoqueCarregadores.getCarregadores().get(0).toString());
		System.out.println("\n");
		System.out.println(estoquePeliculas.getPeliculas().get(0).toString());
		System.out.println("\n");
		System.out.println(estoqueFones.getFones().get(0).toString());
		
	}

}
