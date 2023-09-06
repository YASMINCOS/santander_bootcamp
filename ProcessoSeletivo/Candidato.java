package ProcessoSeletivo;

public abstract class Candidato {
    private String nome;
    private double nota;

    public Candidato(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public abstract boolean isValid();

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}
