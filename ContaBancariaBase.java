public class ContaBancariaBase implements ContaBancariaInterface {
    private String titular;
    protected double saldo;

    public ContaBancariaBase(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual da conta de " + titular + ": R$" + saldo);
    }
} 