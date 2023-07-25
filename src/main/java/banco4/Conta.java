package banco4;

public class Conta {
    protected double saldo;

    public Conta(double saldoInicial){
        saldo = saldoInicial;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        saldo = saldo + valor;
        return true;
    }

    public boolean sacar(double amount){
        if(this.saldo >= amount){
            saldo = saldo - amount;
            return true;
        }
        return false;
    }
}
