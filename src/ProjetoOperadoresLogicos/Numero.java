package ProjetoOperadoresLogicos;

public class Numero {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String verificarNumero() {

		if (this.valor % 2 == 0 && this.valor > 0) {
			return "PAR POSITIVO";
		} else if (this.valor % 2 == 0 && this.valor < 0) {
			return "PAR NEGATIVO";
		} else if (this.valor % 2 != 0 && this.valor > 0) {
			return "PAR NEGATIVO";
		} else if (this.valor % 2 != 0 && this.valor < 0) {
			return "IMP�R NEGATIVO";
		} else {
			return "NULO";
		}
	}
}
