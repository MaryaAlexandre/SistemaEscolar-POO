import java.util.Scanner;

public class SistemaEscolar{
    private RepositorioAlunos alunos;
    private RepositorioDisciplinas disciplinas;
    private RepositorioProfessores professores;
    private RepositorioTurmas turmas;

    public SistemaEscolar(){
        this.alunos = new RepositorioAlunos();
        this.disciplinas = new RepositorioDisciplinas();
        this.professores = new RepositorioProfessores();
        this.turma = new RepositorioTurmas();
    }

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
    
    while(continuar){
        System.out.println("Digite o comando (ex: cadastrar aluno, cadastrar disciplina, sair):");
        String comando = scanner.nextLine();

        switch (comando) {
            case "cadastrar aluno":
            cadastrarAluno(scanner);
            break;

            case "cadastrar disciplina" :
            cadastrarDisciplina(Scanner);
            break;

            case "sair":
            continuar = false;
            break;
        default:
            System.out.println("Comando não reconhecido.");
            break;
        }
    }
}

private void cadastrarAluno(Scanner scanner) {
    System.out.println("Nome completo do aluno: ");
    String nome = scanner.nextLine();
    System.out.println("Matrícula do aluno: ");
    String matricula = scanner.nextLine();
    Aluno aluno = new Aluno(nome,matricula);
    alunos.adicionarAluno(aluno);
    System.out.println("Aluno cadastrado com sucesso!");
}

private void cadastrarDisciplina(Scanner scanner) {
    System.out.println("Nome da disciplina: ");
    String nome = scanner.nextLine();
    System.out.println("Código da disciplina : ");
    String codigo = scanner.nextLine();
    Disciplina disciplina = new Disciplina(nome, codigo);
    disciplinas.adicionarDisciplina(disciplina);
    System.out.println("Disciplina cadastrada com sucesso!");
}
private void registrarNota(Scanner scanner) {
    System.out.println("Digite a matrícula do aluno: ");
    String matricula = scanner.nextLine();
    Aluno aluno = alunos.buscarAluno(matricula);
    if (aluno == null){
       System.out.println("Aluno não encontrado.");
       return; 
    }
    System.out.println("Digite o código da disciplina: ");
    String codigoDisciplina = scanner.nextLine();
    Disciplina disciplina = disciplinas.buscarDisciplina(codigoDisciplina);
    if (disciplina == null) {
        System.out.println("Turma não encontrada");
        return;
    }
    System.out.println("Qual nota deseja registrar? (1,2 ou 3 para prova final):");
    inter numeroNota = Integer.parseInt(scanner.nextLine());

    System.out.println("Digite a nota:");
    double nota = Double.parseDouble(scanner.nextLine());

    turma.registrarNota(aluno, numeroNota, nota);
    System.out.println("Nota registrada com sucesso.");
}
private void emitirBoletim(Scanner scanner) {
    System.out.println("Digite a matrícula do aluno: ");
    String matricula = scanner.nextLine();
    Aluno aluno = alunos.buscarAluno(matricula);

    if (aluno == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }
    System.out.println("Digite o código da disciplina: ");
    String codigoDisciplina = scanner.netxLine();
    Disciplina disciplina = disciplinas.buscarDisciplinas(codigoDisciplina);
    if (disciplina == null) {
        System.out.println("Disciplina não encontrada.");
        return;
    }
    Turma turma = turmas.buscarTurma(disciplina);
    if (turma == null){
        System.out.println("Turma não encontrada.");
        return;
    }
    turma.emitirBoletim(aluno);
}
public static void main(String[] args) {
    SistemaEscolar sistema = new SistemaEscolar ();
    sistema.iniciar();
}
}
