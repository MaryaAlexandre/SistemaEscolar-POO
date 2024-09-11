import java.util.ArrayList;
import java.util.List;

publlic class RepositorioAlunos{
    private List<Aluno>;

public RepositorioAlunos(){
    this.alunos = new ArrayList<>();
}

public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
}

public Aluno buscarAluno(String matricula){
    for (Aluno aluno : alunos){
        if (aluno.getMatricula().equals(matricula)) {
            return aluno;
        }
    }
    return null;
}
public void removerAluno(String matricula){
    alunos.removerIf(aluno-> aluno.getMatricula().equals(matricula));
}
}