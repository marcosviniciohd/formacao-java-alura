import calculo.FiltroRecomentacao;
import modelos.Epsodio;
import modelos.Filme;
import modelos.Serie;

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


        Epsodio epsodio = new Epsodio();
        epsodio.setNome("O inverno está chegando");
        epsodio.setNumero(1);
        epsodio.setSerie(serie);
        System.out.println("Epsódio: " + epsodio.getNumero());
        System.out.println("Série: " + epsodio.getSerie().getNome());
        epsodio.setTotalDeAvaliacoes(300);
        filtro.filtra(epsodio);

    }
}
