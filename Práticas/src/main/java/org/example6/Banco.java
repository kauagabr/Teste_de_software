package org.example6;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Double> contas = new HashMap<>();


    public void criarConta(String numeroConta, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        contas.put(numeroConta, saldoInicial);
    }


    public double consultarSaldo(String numeroConta) {
        validarContaExistente(numeroConta);
        return contas.get(numeroConta);
    }


    public void depositar(String numeroConta, double valor) {
        validarContaExistente(numeroConta);
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo");
        }
        contas.put(numeroConta, contas.get(numeroConta) + valor);
    }


    public void sacar(String numeroConta, double valor) {
        validarContaExistente(numeroConta);
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo");
        }
        if (contas.get(numeroConta) < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
        contas.put(numeroConta, contas.get(numeroConta) - valor);
    }


    public void transferir(String contaOrigem, String contaDestino, double valor) {
        validarContaExistente(contaOrigem);
        validarContaExistente(contaDestino);
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transferência deve ser positivo");
        }
        if (contas.get(contaOrigem) < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }
        contas.put(contaOrigem, contas.get(contaOrigem) - valor);
        contas.put(contaDestino, contas.get(contaDestino) + valor);
    }


    private void validarContaExistente(String numeroConta) {
        if (!contas.containsKey(numeroConta)) {
            throw new IllegalArgumentException("Conta não existe: " + numeroConta);
        }
    }
}
