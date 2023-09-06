package ProcessoSeletivo;

public class CandidatoRegular extends Candidato {
    public CandidatoRegular(String nome, double nota) {
        super(nome, nota);
    }

    @Override
    public boolean isValid() {
        return getNota() >= 7.0;
    }
}

