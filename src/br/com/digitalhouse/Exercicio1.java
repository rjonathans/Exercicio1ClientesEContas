package br.com.digitalhouse;

public class Exercicio1<C> {

    public static void main(String[] args) {


        Cliente c1 = new Cliente("Tairo", "Miguel");
        Cliente c2 = new Cliente("Jessica", "Correa");

        Conta contaC1 = new Conta(120900, 100.00, c1);
        Conta contaC2 = new Conta(989456, 0, c2);

        contaC1.deposito(600.00);
        contaC2.saque(1);

    }
}