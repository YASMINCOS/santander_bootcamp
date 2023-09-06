package DiagramacaoPOO;

public class iPhone extends DispositivoEletronico implements Camera {
    private Aplicativo[] aplicativos;
    private int numAplicativosInstalados;

    public iPhone(String modelo, String cor, int capacidadeArmazenamento) {
        super(modelo, cor, capacidadeArmazenamento);
        this.aplicativos = new Aplicativo[10]; 
        this.numAplicativosInstalados = 0;
    }

    @Override
    public void ligar() {
        System.out.println(modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println(modelo + " está desligado.");
    }

    public void instalarAplicativo(Aplicativo app) {
        if (numAplicativosInstalados < 10) {
            aplicativos[numAplicativosInstalados] = app;
            numAplicativosInstalados++;
            System.out.println("O aplicativo " + app.getNome() + " foi instalado.");
        } else {
            System.out.println("Não é possível instalar mais aplicativos. A capacidade está cheia.");
        }
    }

    public void listarAplicativosInstalados() {
        System.out.println("Aplicativos instalados no " + modelo + ":");
        for (int i = 0; i < numAplicativosInstalados; i++) {
            System.out.println((i + 1) + ". " + aplicativos[i].getNome());
        }
    }

    @Override
    public void tirarFoto() {
        System.out.println("Foto tirada com sucesso no " + modelo + ".");
    }
}