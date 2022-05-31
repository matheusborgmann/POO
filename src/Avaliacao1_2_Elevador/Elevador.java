package Avaliacao1_2_Elevador;




public class Elevador {


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

    public void entra() {
        if(pessoas == capElevador){
            System.out.println("Elevador cheio!");
        }else{
            pessoas++;
            System.out.println("Número de pessoas no elevador: " + pessoas);
        }
    }

    public void removePerson() {
        if(pessoas == 0){
            System.out.println("Elevador vazio!");
        }else{
            pessoas--;
            System.out.println("Número de pessoas no elevador: " + pessoas);
        }
    }

    public void upFloor(int Andar) {
        if (Andar > capAndar || andar < 0) {
            System.out.println("Andar nao existe!");
        } else{
            if (Andar < andar) {
                System.out.println("Voce esta descendo mas ok");
            }
            if(Andar == 0) {
                System.out.println("Este e o terreo!");
            } else if(Andar == capAndar){
                System.out.println("Este e o ultimo andar!");
            }
                andar = Andar;
                System.out.println("Andar atual: " + andar);
            }
    }

    public void downFloor(int Andar) {
        if (Andar > capAndar || andar < 0){
            System.out.println("Andar nao existe!");
        }else{
            if (Andar > andar) {
                System.out.println("Voce esta subindo mas ok");
            }
            if(Andar == 0){
                System.out.println("Este e o terreo!");
            }else if(Andar == capAndar){
                System.out.println("Este e o ultimo andar!");
            }
            andar = Andar;
            System.out.println("Andar atual: " + andar);
        }
    }
}