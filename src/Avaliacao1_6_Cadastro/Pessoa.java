package Avaliacao1_6_Cadastro;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;

    public String getNome() {
        return nome;
    }

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, char sexo){

    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
}
