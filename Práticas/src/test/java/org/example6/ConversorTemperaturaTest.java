package org.example6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTemperaturaTest {
    private double celsius;
    private double fahrenheit;
    ConversorTemperatura conversorTemperatura;
    @BeforeEach
    void setUp() {
        celsius = 18;
        fahrenheit = 19.4;
        conversorTemperatura = new ConversorTemperatura();
    }

    @Test
    void deveConverterCelsiusParaFahrenheit() {
        assertEquals(64.4, conversorTemperatura.celsiusParaFahrenheit(celsius));

    }

    @Test
    void deveConverterFahrenheitParaCelsius() {
        assertEquals(-7.000000000000001, conversorTemperatura.fahrenheitParaCelsius(fahrenheit));
    }
}