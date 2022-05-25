package Constructors;

public class Tricolor {

	private String cor;

	public Tricolor(String cor) {
		this.cor = cor;
	}

	public void corAzul() {
		this.cor = "Azul";
	}
	public void corBranca() {
		this.cor = "Branca";
	}
	public void corPreta() {
		this.cor = "Preta";
	}

	public String toString() {
		return "O time tem a seguinte cor: " + this.cor;
	}
}
