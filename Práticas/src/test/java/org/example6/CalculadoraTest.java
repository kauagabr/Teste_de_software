package org.example6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private int a;
    private int b;
    private int c;
    private Calculadora calculadora;
    @BeforeEach
    void setUp() {
        a = 3;
        b = 2;
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("O metodo deve somar")
    public void deveSomar2numeros() {
        c = a + b;
        Assertions.assertEquals(c, calculadora.somar(a, b));

    }

    @Test
    public void deveSubtrair2numeros() {
        c = a - b;
        Assertions.assertEquals(c, calculadora.subtrair(a, b));
    }

    @Test
    public void deveMultiplicar2numeros() {
        c = a * b;
        Assertions.assertEquals(c, calculadora.multiplicar(a, b));
    }

    @Test
    public void deveDividir2numeros() {
        c = a / b;
        Assertions.assertEquals(c, calculadora.dividir(a, b));
    }
}