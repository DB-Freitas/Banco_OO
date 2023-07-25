package banco;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
        Conta contaBH = new Conta(50000.00);
        brunoHenrique.setConta(contaBH);

        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
        Conta contaER = new Conta(45000.00);
        evertonRibeiro.setConta(contaER);

        Cliente filipeLuis = new Cliente("Filipe", "Luis");
        Conta contaFL = new Conta(70000.00);
        filipeLuis.setConta(contaFL);

        banco.adicionarCliente(brunoHenrique);
        banco.adicionarCliente(evertonRibeiro);
        banco.adicionarCliente(filipeLuis);

        for(int i = 0; i < banco.getNumeroDeClientes(); i++){
            Cliente cliente = banco.getCliente(i);
            Conta conta = cliente.getConta();

            String temp = "Cliente [" + (i + 1) + "] : " + cliente.getNome() + " " +
                    cliente.getSobrenome() + ". Saldo R$:" + conta.getSaldo();
            System.out.println(temp);
        }
    }
}
