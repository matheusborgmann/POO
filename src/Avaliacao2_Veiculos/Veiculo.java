package Avaliacao2_Veiculos;

import java.util.ArrayList;

public abstract class Veiculo {

    protected String nome;

    protected int anoFabricacao;
    protected int capacidade;
    protected Fabricante fabricante;

    protected ArrayList<Barco> barcos;

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

    public Veiculo(){
        barcos = new ArrayList<Barco>();
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if(anoFabricacao < 0 )
            throw new IllegalArgumentException(
                    "Ano deve ser um ano positivo!");
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(capacidade < 0 )
            throw new IllegalArgumentException(
                    "Capacidade deve ser um numero positivo!");
        this.capacidade = capacidade;
    }

    public abstract void acelerar();

    public abstract void mostrarDetalhes();

}