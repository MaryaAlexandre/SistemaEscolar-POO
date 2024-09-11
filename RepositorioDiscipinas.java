import java.util.ArrayList;
import java.util.List;

public class RepositorioDisciplinas {
    private List<Disciplinas> disciplinas;

    public RepositorioDisciplinas(){
        this.disciplinas = new ArrayList<>();
    }
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Disciplina buscarDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }
    public void removerDisciplina(String codigo) {
        disiciplinas.removeIf(disciplina -> disciplina.getCodigo().equals(codigo));
    }
}