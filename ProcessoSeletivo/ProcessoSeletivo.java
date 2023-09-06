package ProcessoSeletivo;

import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    private List<Candidato> candidatos = new ArrayList<>();

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void realizarSelecao() {
        for (Candidato candidato : candidatos) {
            try {
                if (candidato.isValid()) {
                    System.out.println(candidato.getNome() + " foi aprovado!");
                } else {
                    throw new CandidatoInvalidoException(candidato.getNome() + " foi reprovado.");
                }
            } catch (CandidatoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        ProcessoSeletivo processo = new ProcessoSeletivo();
        processo.adicionarCandidato(new CandidatoRegular("Alice", 8.5));
        processo.adicionarCandidato(new CandidatoPrioritario("Bob", 7.8));
        processo.adicionarCandidato(new CandidatoRegular("Charlie", 6.0));
        processo.adicionarCandidato(new CandidatoPrioritario("David", 9.5));

        processo.realizarSelecao();
    }
}
