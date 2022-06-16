package Avaliacao2_Veiculos;

public class Aviao extends Veiculo {
    private int numTurbinas;

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    @Override
    public void acelerar() {
        System.out.println("O avião acelerou.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("O avião" + getNome() + "de " + getAnoFabricacao()
                + ", produzido por " + getFabricante()
                + "de capacidade de " + getCapacidade() + "de pessoas"
                + "possui " + getNumTurbinas() + "velas!");
    }

    public void decolar(){
        System.out.println("O avião decolou.");
    }

    public void pousar(){
        System.out.println("O avião pousou.");
    }
}
