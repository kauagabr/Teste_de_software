import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.example4.SistemaDeGestao;
import org.example4.Aluno;
import org.example4.Curso;

public class SistemaDeGestaoTest {

    private SistemaDeGestao sistema;
    private Curso cursoJava;
    private Curso cursoPython;
    private Aluno alunoAna;
    private Aluno alunoBruno;

    @BeforeEach
    public void setup() {
        sistema = new SistemaDeGestao();

        cursoJava = new Curso("Java", 2);
        cursoPython = new Curso("Python", 2);

        alunoAna = new Aluno("Ana");
        alunoBruno = new Aluno("Bruno");

        sistema.adicionarCurso(cursoJava);
        sistema.adicionarCurso(cursoPython);
        sistema.registrarAluno(alunoAna);
        sistema.registrarAluno(alunoBruno);
    }

    @Test
    public void deveMatricularAlunoEmCursoDisponivel() {
        boolean matriculado = sistema.matricularAlunoEmCurso("Ana", "Java");
        assertTrue(matriculado);
        assertEquals(1, cursoJava.getAlunosMatriculados().size());
        assertTrue(alunoAna.getCursoMatriculados().contains(cursoJava));
    }

    @Test
    public void naoDeveMatricularAlunoEmCursoCheio() {
        sistema.matricularAlunoEmCurso("Ana", "Java");
        sistema.matricularAlunoEmCurso("Bruno", "Java");
        Aluno alunoCarlos = new Aluno("Carlos");
        sistema.registrarAluno(alunoCarlos);

        boolean matriculado = sistema.matricularAlunoEmCurso("Carlos", "Java");
        assertFalse(matriculado);
    }

    @Test
    public void deveDesmatricularAlunoDeCurso() {
        sistema.matricularAlunoEmCurso("Ana", "Python");
        boolean desmatriculado = sistema.desmatricularAlunoDeCurso("Ana", "Python");

        assertTrue(desmatriculado);
        assertFalse(cursoPython.getAlunosMatriculados().contains(alunoAna));
        assertFalse(alunoAna.getCursoMatriculados().contains(cursoPython));
    }

    @Test
    public void naoDeveDesmatricularAlunoNaoMatriculado() {
        boolean desmatriculado = sistema.desmatricularAlunoDeCurso("Ana", "Python");
        assertFalse(desmatriculado);
    }
}