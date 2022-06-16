package Avaliacao2_Veiculos;

public class Automovel extends Veiculo {
    private int diametroRoda;

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }

    public void abrirPortaMalas(){
        System.out.println("O porta do carro foi aberto");
    }

    @Override
    public void acelerar() {
        System.out.println("O automóvel acelerou.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("O automovel" + getNome() + " de " + getAnoFabricacao()
                + ", produzido por " + fabricante.getNome() + "(" + fabricante.getPaisDeOrigem() + ")"
                + "de capacidade de " + getCapacidade() + " de pessoas"
                + " possui " + getDiametroRoda() + "velas!");
    }
}
