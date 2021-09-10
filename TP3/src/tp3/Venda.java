package tp3;

public class Venda {
	private Cliente cliente;
	private Produto prod;
	private int quantidade;
	
	public Venda(Cliente cliente, Produto prod, int quantidade) {
		this.cliente = cliente;
		this.prod = prod;
		this.quantidade = quantidade;
	}
	
	//Getters e Setters
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
