package Avaliacao2_Veiculos;

public abstract class Veiculo {

    protected String nome;
    protected String nomeFab;
    protected String paisDeOrig;
    protected int anoFabricacao;
    protected int capacidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void acelerar();

    public abstract void mostrarDetalhes();

}