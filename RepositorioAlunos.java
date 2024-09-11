import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class RepositorioAlunos {
    private List<Aluno> alunos;

    // Construtor da classe
    public RepositorioAlunos() {
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
public void removerAluno(Aluno aluno) {
    Iterator<Aluno> iterator = alunos.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().equals(aluno)) {
            iterator.remove();
}
}
}
}