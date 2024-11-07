package org.example4;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGestao {
    private List<Curso> cursos;
    private List<Aluno> alunos;

    public SistemaDeGestao() {
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public boolean matricularAlunoEmCurso(String nomeAluno, String nomeCurso) {
        Aluno aluno = buscarAluno(nomeAluno);
        Curso curso = buscarCurso(nomeCurso);

        if (aluno != null && curso != null) {
            return curso.adicionarAluno(aluno);
        }
        return false;
    }

    public boolean desmatricularAlunoDeCurso(String nomeAluno, String nomeCurso) {
        Aluno aluno = buscarAluno(nomeAluno);
        Curso curso = buscarCurso(nomeCurso);

        if (aluno != null && curso != null) {
            return curso.removerAluno(aluno);
        }
        return false;
    }

    public Aluno buscarAluno(String nome) {
        return alunos.stream().filter(a -> a.getNome().equals(nome)).findFirst().orElse(null);
    }

    public Curso buscarCurso(String nome) {
        return cursos.stream().filter(c -> c.getNome().equals(nome)).findFirst().orElse(null);
    }
}

