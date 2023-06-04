package br.edu.marcos.programa;

import br.edu.marcos.modelo.Musica;
import br.edu.marcos.modelo.MusicasPreferidas;
import br.edu.marcos.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Bohemian Rhapsody");
        minhaMusica.setCantor("Queen");
        minhaMusica.setAlbum("A Night at the Opera");
        minhaMusica.setGenero("Rock");

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("NerdCast");
        meuPodcast.setApresentador("Alexandre Ottoni");
        meuPodcast.setDescricao("O melhor podcast do Brasil");

        for (int i = 0; i < 2000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 1500; i++) {
            minhaMusica.curte();
        }

        for (int i = 0; i < 2000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1500; i++) {
            meuPodcast.curte();
        }

        MusicasPreferidas minhasPreferidas = new MusicasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);

    }
}
