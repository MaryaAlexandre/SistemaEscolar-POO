import java.util.ArrayList;
import java.util.List;

public class RepositorioProfessores {
    private List<Professor> professores;
    public Repositorioprofessores() {
    this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public Professor buscarProfessor(String identificacao) {
     for (Professor professor : professores) {
        if ( professor.getIdentificacao().equals(identificacao)) {
            return professor;
        }
     }
     return null;
    }

    public void removerProfessor(String identificacao) {
       professores.removeIf(professor -> professor.getIdentificacao().equals(identificacao)); 
    }
}