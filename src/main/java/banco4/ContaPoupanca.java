package banco4;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(double saldoInicial, double rendimento){
        super(saldoInicial);
        taxaRendimento = rendimento;
    }

}
