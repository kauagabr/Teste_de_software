package org.example7;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AvaliadorProdutoTest {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private Produto produto4;
    private AvaliadorProduto avaliador;
    List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4);

    @Before
    public void setup() {
        produto1 = new Produto("Produto A", 100.0);
        produto2 = new Produto("Produto B", 250.0);
        produto3 = new Produto("Produto C", 50.0);
        produto4 = new Produto("Produto D", 300.0);
        avaliador = new AvaliadorProduto();
           }


    @Test
    void deveAvaliar() {
        avaliador.avalia(produtos);

    }

    @Test
    void getMaiorPreco() {
        double maiorPrecoEsperado = 300.0;
        assertEquals(maiorPrecoEsperado, avaliador.getMaiorPreco(), 0.00001);

    }

    @Test
    void getMenorPreco() {

        avaliador.avalia(produtos);

        double menorPrecoEsperado = 50.0;
        assertEquals(menorPrecoEsperado, avaliador.getMenorPreco(), 0.00001);
        assertThat(avaliador.getMenorPreco(), equalTo(menorPrecoEsperado));

    }

    @Test
    void getTresProdutosMaisCaros() {
        assertEquals(4, produtos.size());


    }
}