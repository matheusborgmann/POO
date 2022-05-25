package ProjetoEstruturaCondicional;

public class Numero {

	private int dia;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String verDiaDaSemana() {
		
		if (this.dia == 1) {
			return "Domingo";
		} else if (this.dia == 2) {
			return "Segunda";
		} else if (this.dia == 2) {
			return "Segunda";
		} else if (this.dia == 3) {
			return "Ter�a";
		} else if (this.dia == 4) {
			return "Quarta";
		} else if (this.dia == 5) {
			return "Quinta";
		} else if (this.dia == 6) {
			return "Sexta";
		} else if (this.dia == 7) {
			return "S�bado";
		} else {
			return "Sem correspondencia";
		}
	}
	
	
}
