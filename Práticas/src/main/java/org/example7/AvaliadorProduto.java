package org.example7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AvaliadorProduto {
    private double maiorPreco = Double.NEGATIVE_INFINITY;
    private double menorPreco = Double.POSITIVE_INFINITY;
    private List<Produto> tresProdutosMaisCaros = new ArrayList<>();


    public void avalia(List<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
            }
            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
            }
        }
        tresProdutosMaisCaros = produtos.stream()
                .sorted(Comparator.comparingDouble(Produto::getPreco).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double getMaiorPreco() {
        return maiorPreco;
    }

    public double getMenorPreco() {
        return menorPreco;
    }

    public List<Produto> getTresProdutosMaisCaros() {
        return tresProdutosMaisCaros;
    }
}
