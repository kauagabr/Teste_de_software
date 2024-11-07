import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.example3.Biblioteca;
import org.example3.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setup() {
        biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("Livro A"));
        biblioteca.adicionarLivro(new Livro("Livro B"));
        biblioteca.adicionarLivro(new Livro("Livro C"));
    }

    @Test
    public void deveEmprestarLivroDisponivel() {
        boolean emprestado = biblioteca.emprestarLivro("Livro A");
        assertTrue(emprestado);
    }

    @Test
    public void naoDeveEmprestarLivroIndisponivel() {
        biblioteca.emprestarLivro("Livro A");
        boolean emprestado = biblioteca.emprestarLivro("Livro A");
        assertFalse(emprestado);
    }

    @Test
    public void naoDeveEmprestarMaisQueTresLivros() {
        biblioteca.emprestarLivro("Livro A");
        biblioteca.emprestarLivro("Livro B");
        biblioteca.emprestarLivro("Livro C");
        boolean emprestado = biblioteca.emprestarLivro("Livro D");
        assertFalse(emprestado);
    }

    @Test
    public void deveDevolverLivroEmprestado() {
        biblioteca.emprestarLivro("Livro A");
        biblioteca.devolverLivro("Livro A");
        boolean emprestado = biblioteca.emprestarLivro("Livro A");
        assertTrue(emprestado);
    }
}