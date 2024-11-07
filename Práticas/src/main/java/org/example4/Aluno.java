package org.example4;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Curso> cursoMatriculados;

    public Aluno(String nome){
        this.nome = nome;
        this.cursoMatriculados = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public List<Curso> getCursoMatriculados(){
        return cursoMatriculados;
    }

    public void matricular(Curso curso){
        cursoMatriculados.add(curso);
    }
}
