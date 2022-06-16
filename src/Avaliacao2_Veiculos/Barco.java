package Avaliacao2_Veiculos;

public class Barco extends Veiculo {
    private int numVelas;

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    @Override
    public void acelerar() {
        System.out.println("O barco acelerou.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("O barco" + getNome()
                + "de " + getAnoFabricacao()
                + ", produzido por " + getFabricante()
                + " de capacidade de " + getCapacidade() + " de pessoas"
                + "possui " + getNumVelas() + "velas!");
    }

    public void icarVelas(){
        System.out.println("O barco está com as velas içadas.");
    }

    public void recolherVelas(){
        System.out.println("Velas recolhidas.");
    }
}
