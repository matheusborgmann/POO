package Avaliacao2_Veiculos;

public class Barco extends Veiculo {

    private int numVelas;

    public Barco(){

    }

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
        System.out.println("O barco " + getNome()
                + ", produzido no ano de " + getAnoFabricacao()
                + ", pela empresa '" + fabricante
                + "', possui a capacidade de " + getCapacidade() + " pessoas."
                + " O barco possui " + getNumVelas() + " velas!");
    }

    public void icarVelas(){
        System.out.println("O barco esta com as velas icadas.");
    }

    public void recolherVelas(){
        System.out.println("Velas recolhidas.");
    }
}