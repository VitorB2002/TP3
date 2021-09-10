package tp3;

public class Menu {

	public static void main(String[] args) {
		Carregador car = new Carregador("Usb - c", "Carregador voltado para celulares com plug c", 15.5, "Inova", 1.5, 2.5);
		Pelicula peli = new Pelicula("3D", "Película protetora anti-impacto", 30.0, "nanoshield", "Vidro", 0.5, "Samsung A8");
		Capa cap = new Capa("Anti-Impacto", "Capa anti-impacto para evitar acidentes", 20, "Incase", "Silicone", "J7 e J5", 1.98, "Azul");
		Fone fon = new Fone("Headset", "Fone de qualidade", 50.0, "TWS", 0.500, "bluetooth", true, "Vermelho", "Silicone");
		Cliente cliente1 = new Cliente("Cleiton", "0549258234921", "Vila Mimosa", "cleiton@gmail2000.com", "61992341041");
		
		System.out.println(car.getModelo() + cap.getModelo() + cliente1.getNome() + peli.getEspessura() + fon.isFiltroRuido());

	}

}
