import java.util.ArrayList;
import java.util.List;

public class RepositorioTurmas {
    private List<Turma> turmas;

    public RepositorioTurmas() {
    this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public Turma buscarTurma(Disciplina disciplina){
    for (Turma turma : turmas) {
        if ( turma.getDisciplina().equals(disciplina)) {
            return turma;
        }
    }
    return null;
    }

    public void registrarNota(Aluno aluno, int numeroNota, double nota) {
        for (Turma turma : turmas) {
            if (turma.getAlunos().contains(aluno)) {
                turma.registrarNota(aluno, numeroNota, nota);
                return;
            }
        }
        System.out.println("Aluno não encontrado na turma.");
    }
    public void removerTurma(Disciplina disciplina) {
        turmas.removeIf(turma -> turma.getDisciplina().equals(disciplina));
    }
}