package br.edu.marcos.vinicio.modelos;

import br.edu.marcos.vinicio.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento, duracaoEmMinutos);
        this.diretor = diretor;
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " - " + this.getAnoDeLancamento() + " - " + this.getDiretor();
    }
}
