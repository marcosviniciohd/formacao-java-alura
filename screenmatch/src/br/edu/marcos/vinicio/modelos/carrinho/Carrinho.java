package br.edu.marcos.vinicio.modelos.carrinho;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();
    public void adicionaProduto(Produto produto) {
        if (produtos.size() < 10){
            produtos.add(produto);
        } else {
            System.out.println("Carrinho cheio");
        }
    }
}
