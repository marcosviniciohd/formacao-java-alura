package br.edu.marcos.vinicio.principal;

import br.edu.marcos.vinicio.calculo.CalculadoraDeTempo;
import br.edu.marcos.vinicio.calculo.FiltroRecomentacao;
import br.edu.marcos.vinicio.modelos.Epsodio;
import br.edu.marcos.vinicio.modelos.Filme;
import br.edu.marcos.vinicio.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setDiretor("Francis Ford Coppola");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        System.out.println("Média: " + meuFilme.pegaMedia());

        FiltroRecomentacao filtro = new FiltroRecomentacao();
        filtro.filtra(meuFilme);


        Serie serie = new Serie();
        serie.setNome("Game of Thrones");
        serie.setAnoDeLancamento(2011);
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

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("Mario Bros");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2023);
        filmeDoPaulo.avalia(10.0);

        var outroFilme = new Filme();
        outroFilme.setNome("As traças da Vovó careca");
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.avalia(10.0);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(listaDeFilmes);


    }
}
