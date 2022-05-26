package Avaliacao1_4_Artistas;

import Avaliacao1_1_Agenda.Pessoa;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Artistas> artista;

    public Sistema () {
        artista = new ArrayList<Artistas>();
    }

    public ArrayList<Artistas> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<Artistas> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "artista=" + artista +
                '}';
    }

    public void armazenarPessoa(Artistas a1) {
        this.artista.add(a1);
    }

    public void buscarPessoa(String nome) {
        for (int i = 0; i < artista.size(); i++) {
            Artistas a = artista.get(i);
            if (a.getNome().equals(nome)) {
                System.out.println(a);
            }
        }
    }
}
