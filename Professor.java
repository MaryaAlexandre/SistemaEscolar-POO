import java.util.List;
import java.util.ArrayList;

// Classe que representa um professor no sistema
public class Professor {
    private String nomeCompleto;   // Nome completo do professor
    private String identificacao;  // Identificação única do professor (como uma matrícula ou ID)

    private List<Turma> turmas;    // Lista de turmas que o professor está lecionando

    // Construtor da classe Professor
    public Professor(String nomeCompleto, String identificacao) {
        this.nomeCompleto = nomeCompleto;        // Inicializa o nome completo do professor
        this.identificacao = identificacao;      // Inicializa a identificação do professor
        this.turmas = new ArrayList<>();         // Inicializa a lista de turmas vazia
    }

    // Retorna o nome completo do professor
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    // Atualiza o nome completo do professor
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Retorna a identificação do professor
    public String getIdentificacao() {
        return identificacao;
    }

    // Atualiza a identificação do professor
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    // Adiciona uma turma à lista de turmas do professor
    public void adicionarTurma(Turma turma) {
        if (!turmas.contains(turma)) {   // Verifica se a turma já não foi adicionada
            turmas.add(turma);           // Adiciona a turma à lista
        }
    }

    // Remove uma turma da lista de turmas do professor
    public void removerTurma(Turma turma) {
        turmas.remove(turma);            // Remove a turma da lista
    }

    // Retorna a lista de turmas lecionadas pelo professor
    public List<Turma> getTurmas() {
        return turmas;
    }

    // Permite ao professor registrar notas dos alunos em uma turma
    public void registrarNota(Aluno aluno, Turma turma, int numeroNota, double nota) {
        if (turmas.contains(turma)) {    // Verifica se o professor leciona a turma
            turma.registrarNota(aluno, numeroNota, nota);  // Registra a nota para o aluno na turma
        }
    }

    // Permite ao professor emitir o boletim de um aluno em uma turma específica
    public void emitirBoletim(Aluno aluno, Turma turma) {
        if (turmas.contains(turma)) {    // Verifica se o professor leciona a turma
            turma.emitirBoletim(aluno);  // Emite o boletim do aluno para a turma
        }
    }
}
