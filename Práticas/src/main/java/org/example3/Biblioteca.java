package org.example3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private int maxLivrosPorUsuario = 3;

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public boolean emprestarLivro(String titulo) {
        int livrosEmprestados = (int) livros.stream().filter(Livro::isEmprestado).count();

        if (livrosEmprestados >= maxLivrosPorUsuario) {
            return false;
        }

        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && !livro.isEmprestado()) {
                livro.emprestar();
                return true;
            }
        }
        return false;
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.isEmprestado()) {
                livro.devolver();
                break;
            }
        }
    }
}