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
        System.out.println("O aviao acelerou.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("O aviao " + getNome() + ", produzido no ano de " + getAnoFabricacao()
                + ", pela empresa '" + getNomeFab()
                + " (" + getPaisDeOrig() + ")"
                + "', possui a capacidade de " + getCapacidade() + " pessoas."
                + " O aviao possui " + getNumTurbinas() + " turbinas!");
    }

    public void decolar(){
        System.out.println("O aviao decolou.");
    }

    public void pousar(){
        System.out.println("O aviao pousou.");
    }
}