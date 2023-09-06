package ProcessoSeletivo;

public class CandidatoPrioritario extends Candidato {
    public CandidatoPrioritario(String nome, double nota) {
        super(nome, nota);
    }

    @Override
    public boolean isValid() {
        return getNota() >= 9.0;
    }
}