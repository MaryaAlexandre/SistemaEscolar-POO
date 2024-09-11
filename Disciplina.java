
// Classe que representa uma disciplina no sistema
public class Disciplina {
    private String nome;  // Nome da disciplina
    private String codigo; // Código único da disciplina

    // Construtor da classe Disciplina
    public Disciplina(String nome, String codigo) {
        this.nome = nome;    // Inicializa o nome da disciplina
        this.codigo = codigo; // Inicializa o código da disciplina
    }

    // Retorna o nome da disciplina
    public String getNome() {
        return nome;
    }

    // Atualiza o nome da disciplina
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o código da disciplina
    public String getCodigo() {
        return codigo;
    }

    // Atualiza o código da disciplina
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
