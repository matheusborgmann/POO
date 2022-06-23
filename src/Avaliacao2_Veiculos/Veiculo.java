package Avaliacao2_Veiculos;

import java.util.ArrayList;

public abstract class Veiculo {

    protected int anoFabricacao;
    protected int capacidade;
    protected String nome;
    /*protected Fabricante fabricante;*/
    protected String nomeFab;
    protected String paisDeOrig;

    public Veiculo(String nome, int anoFabricacao, int capacidade, String nomeFab, String paisDeOrig) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
        this.nomeFab = nomeFab;
        this.paisDeOrig = paisDeOrig;
    }

    public String getNomeFab() {
        return nomeFab;
    }

    public void setNomeFab(String nomeFab) {
        this.nomeFab = nomeFab;
    }

    public String getPaisDeOrig() {
        return paisDeOrig;
    }

    public void setPaisDeOrig(String paisDeOrig) {
        this.paisDeOrig = paisDeOrig;
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