package Avaliacao1_4_Artistas;

public class Artistas {
    private String nome;
    private String genero;
    private String instrumento;
    int albuns;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getAlbuns() {
        return albuns;
    }

    public void setAlbuns(int albuns) {
        this.albuns = albuns;
    }

    @Override
    public String toString() {
        return "Artistas{" +
                "nome='" + this.nome + '\'' +
                ", genero='" + this.genero + '\'' +
                ", instrumento='" + this.instrumento + '\'' +
                ", albuns=" + this.albuns +
                '}';
    }
}
