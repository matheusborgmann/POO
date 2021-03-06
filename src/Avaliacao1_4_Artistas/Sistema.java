package Avaliacao1_4_Artistas;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Artistas> artista;

    public Sistema() {
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

    public void quantidadeArtistas() {
        System.out.println("O numero total de artistas é: " + artista.size());
    }

    public void verTodos() {
        for (int i = 0; i < artista.size(); i++) {
            Artistas a = artista.get(i);
            System.out.println("Nome do artista: " + a.getNome() + 
                               "\tgenero musical: " + a.getGenero() + 
                               "\tinstrumento tocado: " + a.getInstrumento() + 
                               "\tnumero de albuns: " + a.getAlbuns());
        }
    }

    public void apagarTodosArtistas() {
        artista.removeAll(artista);
    }
}
