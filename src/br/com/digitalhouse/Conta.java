package br.com.digitalhouse;

public class Conta {

    //Atributos

    private Integer numeroDaConta;
    private double saldo;
    private Cliente titular;

    //Construtors

    public Conta(Integer novoNumeroDaConta, double novoSaldo, Cliente novoTitular) {
        numeroDaConta = novoNumeroDaConta;
        saldo = novoSaldo;
        titular = novoTitular;
    }

    public void deposito(double quantiaEmDinheiro) {

        saldo = saldo + quantiaEmDinheiro;
        System.out.println("Você depositou: R$ " + quantiaEmDinheiro + ". Seu Saldo Atual é de :" + saldo);

    }

    //Metodos get and set

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer novoNumeroDaConta) {
        numeroDaConta = novoNumeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente novoTitular) {
        titular = novoTitular;
    }

    //Metodos

    public void saque(double quantiaEmDinheiro) {

        if (quantiaEmDinheiro > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - quantiaEmDinheiro;
            System.out.println("Saque de R$ " + quantiaEmDinheiro + "realizado com sucesso! Saldo atualizado: R$ " + saldo);
        }

    }




}