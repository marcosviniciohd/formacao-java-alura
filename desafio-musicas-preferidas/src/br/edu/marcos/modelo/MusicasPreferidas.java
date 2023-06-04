package br.edu.marcos.modelo;

public class MusicasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é um sucesso total!");
        } else {
            System.out.println(audio.getTitulo() + " é um sucesso moderado.");
        }
    }

}
