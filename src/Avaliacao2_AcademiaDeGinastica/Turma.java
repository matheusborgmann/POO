package Avaliacao2_AcademiaDeGinastica;

import java.util.Date;

public class Turma {
    protected int numAlunos;
    protected float horarioDeAula;
    protected int duracaoDeAula;
    protected Date dataInicial, dataFinal;
    protected String tipoDeAtividade;
    protected Instrutor instrutor;

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public float getHorarioDeAula() {
        return horarioDeAula;
    }

    public void setHorarioDeAula(float horarioDeAula) {
        this.horarioDeAula = horarioDeAula;
    }

    public int getDuracaoDeAula() {
        return duracaoDeAula;
    }

    public void setDuracaoDeAula(int duracaoDeAula) {
        this.duracaoDeAula = duracaoDeAula;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getTipoDeAtividade() {
        return tipoDeAtividade;
    }

    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
}
