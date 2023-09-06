package DiagramacaoPOO;
public abstract class DispositivoEletronico {
    protected String modelo;
    protected String cor;
    protected int capacidadeArmazenamento;

    public DispositivoEletronico(String modelo, String cor, int capacidadeArmazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public abstract void ligar();
    public abstract void desligar();

}
