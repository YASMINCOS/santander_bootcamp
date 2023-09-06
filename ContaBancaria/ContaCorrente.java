package ContaBancaria;
class ContaCorrente extends ContaBancariaBase {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double limiteChequeEspecial) {
        super(titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
}
