package br.edu.marcos.vinicio.principal;

import br.edu.marcos.vinicio.calculo.CalculadoraDeTempo;
import br.edu.marcos.vinicio.calculo.FiltroRecomentacao;
import br.edu.marcos.vinicio.modelos.Epsodio;
import br.edu.marcos.vinicio.modelos.Filme;
import br.edu.marcos.vinicio.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972, 175, "Francis Ford Coppola");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        System.out.println("Média: " + meuFilme.pegaMedia());

        FiltroRecomentacao filtro = new FiltroRecomentacao();
        filtro.filtra(meuFilme);


        Serie serie = new Serie("Game of Thrones", 2011);
        serie.setDuracaoEmMinutos(60);
        serie.exibeFichaTecnica();
        serie.avalia(9.5);
        serie.avalia(9.0);
        System.out.println("Média: " + serie.pegaMedia());
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());



        Epsodio epsodio = new Epsodio();
        epsodio.setNome("O inverno está chegando");
        epsodio.setNumero(1);
        epsodio.setSerie(serie);
        System.out.println("Epsódio: " + epsodio.getNumero());
        System.out.println("Série: " + epsodio.getSerie().getNome());
        epsodio.setTotalDeAvaliacoes(300);
        filtro.filtra(epsodio);

        var filmeDoPaulo = new Filme("Mario Bros", 2023, 200, "Paulo");
        filmeDoPaulo.avalia(10.0);

        var outroFilme = new Filme("As traças da Vovó careca", 2023, 200, "Paulo");
        outroFilme.avalia(10.0);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(listaDeFilmes);

        System.out.println("------------------------------------------------------------------------------");
        var novoFilme = new Filme("Meu filme", 2021, 120, "Eu");
        System.out.println(novoFilme);
    }
}
