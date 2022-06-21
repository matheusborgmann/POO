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
        System.out.println("O automovel acelerou.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("O automovel " + getNome() + ", produzido no ano de " + getAnoFabricacao()
                + ", pela empresa '" + getNomeFab()
                + " (" + getPaisDeOrig() + ")"
                + "', possui a capacidade de " + getCapacidade() + " pessoas."
                + " Suas rodas possuem o diametro de " + getDiametroRoda() + " centimetros!");
    }
}