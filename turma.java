import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// Classe que representa uma turma, associada a uma disciplina, professor e alunos
public class Turma {
    private Disciplina disciplina;   // Disciplina associada à turma
    private Professor professor;     // Professor que leciona a turma
    private List<Aluno> alunos;      // Lista de alunos matriculados na turma
    private Map<Aluno, double[]> notas; // Mapeia alunos para suas notas: Nota1, Nota2 e Prova Final

    // Construtor da turma
    public Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina; // Inicializa a disciplina da turma
        this.professor = professor;   // Inicializa o professor da turma
        this.alunos = new ArrayList<>();  // Inicializa a lista de alunos vazia
        this.notas = new HashMap<>();     // Inicializa o mapa de notas vazio
    }

    // Método para adicionar um aluno à turma
    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {   // Verifica se o aluno já não está na turma
            alunos.add(aluno);           // Adiciona o aluno à lista de alunos
            notas.put(aluno, new double[3]); // Inicializa as notas do aluno com três notas (Nota1, Nota2, Prova Final) zeradas
        } else {
            System.out.println("Aluno já está cadastrado nesta turma.");
        }
    }

    // Método para remover um aluno da turma
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);            // Remove o aluno da lista de alunos
        notas.remove(aluno);             // Remove as notas associadas ao aluno
    }

    // Método para registrar notas dos alunos
    public void registrarNota(Aluno aluno, int numeroNota, double nota) {
        if (notas.containsKey(aluno) && numeroNota >= 1 && numeroNota <= 3) {
            notas.get(aluno)[numeroNota - 1] = nota;  // Atualiza a nota correspondente (1 = Nota1, 2 = Nota2, 3 = Prova Final)
        } else {
            System.out.println("Aluno não encontrado ou número de nota inválido.");
        }
    }

    // Método para calcular a média final de um aluno
    public double calcularMedia(Aluno aluno) {
        if (notas.containsKey(aluno)) {  // Verifica se o aluno está matriculado
            double[] notasAluno = notas.get(aluno);   // Obtém as notas do aluno
            double media = (notasAluno[0] + notasAluno[1]) / 2;  // Calcula a média das duas primeiras notas

            // Se a média for menor que 60 e o aluno tiver feito prova final, recalcula a média considerando a prova final
            if (media < 60 && notasAluno[2] > 0) {
                media = (media + notasAluno[2]) / 2;
            }
            return media;
        }
        return 0;  // Se o aluno não estiver matriculado, retorna média 0
    }

    // Método para emitir o boletim de um aluno
    public void emitirBoletim(Aluno aluno) {
        if (notas.containsKey(aluno)) {  // Verifica se o aluno está matriculado na turma
            double[] notasAluno = notas.get(aluno);  // Obtém as notas do aluno
            double media = calcularMedia(aluno);     // Calcula a média final do aluno

            // Exibe o boletim com as notas e a situação (Aprovado ou Reprovado)
            System.out.println("Boletim do aluno: " + aluno.getNomeCompleto());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Nota 1: " + notasAluno[0]);
            System.out.println("Nota 2: " + notasAluno[1]);
            if (notasAluno[2] > 0) {
                System.out.println("Prova final: " + notasAluno[2]);
            }
            System.out.println("Média final: " + media);
            System.out.println(media >= 60 ? "Situação: Aprovado" : "Situação: Reprovado");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Retorna a disciplina da turma
    public Disciplina getDisciplina() {
        return disciplina;
    }

    // Retorna o professor responsável pela turma
    public Professor getProfessor() {
        return professor;
    }

    // Retorna a lista de alunos matriculados na turma
    public List<Aluno> getAlunos() {
        return alunos;
    }

    // Método toString para exibir informações da turma
   
    public String toString() {
        return "Turma de " + disciplina.getNome() + ", Professor: " + professor.getNomeCompleto();
    }
}
