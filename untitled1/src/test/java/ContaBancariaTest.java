import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.example2.ContaBancaria;


public class ContaBancariaTest {

    @Test
    public void deveDepositarCorretamente() {
        ContaBancaria conta = new ContaBancaria("João", 100.0);
        conta.depositar(50.0);
        assertEquals(150.0, conta.getSaldo(), 0.00001);
    }

    @Test
    public void naoDeveDepositarValorNegativo() {
        ContaBancaria conta = new ContaBancaria("João", 100.0);
        conta.depositar(-50.0);
        assertEquals(100.0, conta.getSaldo(), 0.00001);
    }

    @Test
    public void deveSacarCorretamente() {
        ContaBancaria conta = new ContaBancaria("João", 100.0);
        conta.sacar(30.0);
        assertEquals(70.0, conta.getSaldo(), 0.00001);
    }

    @Test
    public void naoDeveSacarValorMaiorQueSaldo() {
        ContaBancaria conta = new ContaBancaria("João", 100.0);
        conta.sacar(150.0);
        assertEquals(100.0, conta.getSaldo(), 0.00001);
    }
}
