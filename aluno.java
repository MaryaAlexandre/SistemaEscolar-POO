// Classe que representa um aluno no sistema
public class Aluno {
    private String nomeCompleto;// Armazena o nome completo do aluno
    private String matricula;// Armazena a matrícula única do aluno

    // Construtor da classe Aluno
    public Aluno(String nomeCompleto, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
    }
// Retorna o nome completo do aluno
    public String getNomeCompleto() {
        return nomeCompleto;
    }
// Retorna a matrícula do aluno
    public String getMatricula() {
     return matricula;   
    }
 // Atualiza a matrícula do aluno
    public String toString(){
        return "Aluno:" + nomeCompleto + "Matrícula:" + matricula;
    }
}