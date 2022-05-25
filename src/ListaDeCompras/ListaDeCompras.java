package ListaDeCompras;

import java.util.ArrayList;

public class ListaDeCompras {

	private ArrayList<Produto> lista;


	// construtor que inicializa o atributo(vari�vel)
	public ListaDeCompras() {
		lista = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListaDeCompras{" + "lista=" + lista + "}";
	}

	public void adicionarProduto(Produto p1) {
		this.lista.add(p1);
	}

	public void apagarTudo() {
		this.lista.clear();
	}

	public int obterQuantidadeDeProdutos() {
		return this.lista.size();
	}

	public double calcularTotalDaLista() {
		double soma = 0;
		for (int i = 0; i < this.lista.size(); i++) {
			soma = soma + this.lista.get(i).calcularTotal();
		}
		return soma;
	}

}
