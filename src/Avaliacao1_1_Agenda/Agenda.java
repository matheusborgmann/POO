package Avaliacao1_1_Agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> agenda;

    public Agenda() {
        agenda = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Pessoa> agenda) {
        this.agenda = agenda;
    }


    @Override
    public String toString() {
        return "Agenda: " + agenda;
    }

    public void armazenarPessoa(Pessoa p1) {
        this.agenda.add(p1);
    }

    public void removePessoa(String nome){
        for (int i = 0; i < agenda.size(); i++){
            Pessoa p = agenda.get(i);
            if(p.getNome().equals(nome)){
                agenda.remove(p);
            }
        }
    }

    public void buscarPessoa(String nome){
        for (int i = 0; i < agenda.size(); i++){
            Pessoa p = agenda.get(i);
            if(p.getNome().equals(nome)){
                System.out.println(nome + " está na posição: " + i);
            }
        }
    }

    public void imprimePessoa(int index){
            Pessoa p = agenda.get(index);
        System.out.println(p);
    }

}
