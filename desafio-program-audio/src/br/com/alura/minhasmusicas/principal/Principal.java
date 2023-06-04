package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferiadas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Bohemian Rhapsody");
        minhaMusica.setCantor("Queen");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 2000; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Hipsters Ponto Tech");
        meuPodcast.setApresentador("Paulo Silveira");

        for (int i = 0; i < 2500; i++) {
            meuPodcast.curtir();
        }
        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduzir();
        }

        MinhasPreferiadas preferiadas = new MinhasPreferiadas();
        preferiadas.inclui(meuPodcast);
        preferiadas.inclui(minhaMusica);

    }
}
