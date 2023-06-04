package br.com.alura.minhasmusicas.modelo;

public class MinhasPreferiadas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " também é bom, mas não é sucesso absoluto.");
        }
    }
}
