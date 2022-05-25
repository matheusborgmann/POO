package Avaliacao1_Elevador;


import java.util.Scanner;

public class Elevador {

    Scanner sc = new Scanner(System.in);

    public int capElevador;
    public int capAndar;
    private int pessoas;
    private int andar;

    public Elevador() {

    }

    public int getCapElevador() {
        return capElevador;
    }

    public void setCapElevador(int capElevador) {
        this.capElevador = capElevador;
    }

    public int getCapAndar() {
        return capAndar;
    }

    public void setCapAndar(int capAndar) {
        this.capAndar = capAndar;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void  ElevadorNovo () {
        pessoas = 0;
        andar = 0;
    }

    /*public void Inicializa() {


    }*/

    public int entra() {
        if(pessoas == capElevador){
            System.out.println("Elevador cheio!");
        }else{
            pessoas++;
            System.out.println("Número de pessoas no elevador: " + pessoas);
        }
        return pessoas;
    }

    public int removePerson() {
        if(pessoas == 0){
            System.out.println("Elevador vazio!");
        }else{
            pessoas--;
            System.out.println("Número de pessoas no elevador: " + pessoas);
        }

        return pessoas;
    }

    public int upFloor() {
        if(andar == capAndar){
            System.out.println("Este é o último andar!");
        }else{
            andar++;
            System.out.println("Andar atual: " + andar);
        }

        return andar;
    }

    public int downFloor() {
        if(andar == 0){
            System.out.println("Este é o térreo!");
        }else{
            andar--;
            System.out.println("Andar atual: " + andar);
        }

        return andar;
    }

}