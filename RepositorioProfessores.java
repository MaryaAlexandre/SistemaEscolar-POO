import java.util.ArrayList;
import java.util.List;

public class RepositorioProfessores {
    private List<Professor> professores;

    // Construtor corrigido com o nome correto
    public RepositorioProfessores() {
        this.professores = new ArrayList<>();
    }

    // Método para adicionar um professor
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    // Método para buscar um professor pelo identificador
    public Professor buscarProfessor(String identificacao) {
        for (Professor professor : professores) {
            if (professor.getIdentificacao().equals(identificacao)) {
                return professor;
            }
        }
        return null;
    }

    // Método para remover um professor pelo identificador
    public void removerProfessor(String identificacao) {
        professores.removeIf(professor -> professor.getIdentificacao().equals(identificacao));
    }
}
