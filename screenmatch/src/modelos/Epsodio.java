package modelos;

import calculo.Classificavel;

public class Epsodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalDeAvaliacoes > 100) {
            return 5;
        } else {
            return 2;
        }
    }
}
