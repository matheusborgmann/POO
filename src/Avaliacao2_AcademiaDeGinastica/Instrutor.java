package Avaliacao2_AcademiaDeGinastica;

public class Instrutor {

    private String nome;
    private String rg;
    private String dataNasc;
    private String titu;
    private String tel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTitu() {
        return titu;
    }

    public void setTitu(String titu) {
        this.titu = titu;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome='" + nome + '\'' +
                ", rg=" + rg +
                ", dataNasc='" + dataNasc + '\'' +
                ", titu='" + titu + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
