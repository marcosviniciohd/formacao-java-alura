package br.edu.marcos.vinicio.principal;

import br.edu.marcos.vinicio.modelos.Filme;
import br.edu.marcos.vinicio.modelos.Serie;
import br.edu.marcos.vinicio.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972, 175, "Francis Ford Coppola");
        meuFilme.avalia(10.0);
        var outroFilme = new Filme("As traças da Vovó careca", 2023, 200, "Paulo");
        outroFilme.avalia(5.0);
        Filme filmeDoPaulo = new Filme("Mario Bros", 2023, 200, "Paulo");
        filmeDoPaulo.avalia(10.0);
        var lost = new Serie("Lost", 2004);

        var lista = new ArrayList<Titulo>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        /*lista.forEach(item -> System.out.println(item.getNome()));
        lista.forEach(System.out::println);*/
    }
}
