package Avaliacao2_AcademiaDeGinastica;

import java.util.Collection;
import java.util.Date;

public class Turma {


    protected String nome;

    protected Aluno aluno;
    protected int numAlunos;
    protected String horarioDeAula;
    protected String duracaoDeAula;
    protected String dataInicial, dataFinal;
    protected String tipoDeAtividade;
    protected Instrutor instrutor;

    public Turma(String nome, int numAlunos, String horarioDeAula, String duracaoDeAula, String dataInicial, String dataFinal, String tipoDeAtividade) {
        this.nome = nome;
        this.numAlunos = numAlunos;
        this.horarioDeAula = horarioDeAula;
        this.duracaoDeAula = duracaoDeAula;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public Turma(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public String getHorarioDeAula() {
        return horarioDeAula;
    }

    public void setHorarioDeAula(String horarioDeAula) {
        this.horarioDeAula = horarioDeAula;
    }

    public String getDuracaoDeAula() {
        return duracaoDeAula;
    }

    public void setDuracaoDeAula(String duracaoDeAula) {
        this.duracaoDeAula = duracaoDeAula;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
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

    @Override
    public String toString() {
        return "\nTurma{" +
                "nome='" + nome + '\'' +
/*
                ", aluno=" + aluno +
*/
                ", numAlunos=" + numAlunos +
                ", horarioDeAula=" + horarioDeAula +
                ", duracaoDeAula=" + duracaoDeAula +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", tipoDeAtividade='" + tipoDeAtividade + '\'' +
                ", instrutor=" + instrutor +
                '}';
    }
}
