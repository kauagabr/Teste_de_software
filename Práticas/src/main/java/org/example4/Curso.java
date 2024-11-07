package org.example4;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private int capacidadeMax;
    private List<Aluno> alunosMatriculados;

    public Curso(String nome, int capacidadeMax){
        this.nome = nome;
        this.capacidadeMax = capacidadeMax;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public int getCapacidadeMax(){
        return capacidadeMax;
    }

    public List<Aluno> getAlunosMatriculados(){
        return alunosMatriculados;
    }

    public boolean adicionarAluno(Aluno aluno){
        if (alunosMatriculados.size() < capacidadeMax){
            alunosMatriculados.add(aluno);
            aluno.matricular(this);
            return true;
        }
        return false;
    }

    public boolean removerAluno(Aluno aluno){
        if (alunosMatriculados.contains(aluno)){
            alunosMatriculados.remove(aluno);
            aluno.getCursoMatriculados().remove(this);
            return true;
        }
        return false;
    }
}
