package DiagramacaoPOO;

public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("iPhone 12", "Preto", 256);
        meuiPhone.ligar();
        meuiPhone.tirarFoto();
        meuiPhone.instalarAplicativo(new Aplicativo("Calendário", 50));
        meuiPhone.listarAplicativosInstalados();
        meuiPhone.desligar();
    }
}
