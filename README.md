# Sistema de Gerenciamento Escolar
## Visão Geral
Este projeto consiste no desenvolvimento de um Sistema de Gerenciamento Escolar implementado em Java, com uma interface de linha de comando. O sistema permite que administradores e professores realizem o cadastro de alunos, disciplinas, professores e turmas, além de possibilitar o registro de notas, cálculo de médias e emissão de boletins escolares. O sistema também implementa regras de avaliação com critérios de aprovação baseados nas notas dos alunos.

# Funcionalidades Principais
## 1. Cadastro de Entidades
Alunos: Permite o cadastro de novos alunos com informações como nome completo e número de matrícula.
Disciplinas: Permite o cadastro de disciplinas semestrais, cada uma com um nome e código único.
Professores: Permite o cadastro de professores com nome e identificação únicos.
Turmas: Cada turma é composta por um professor, uma disciplina e uma lista de alunos. O sistema gerencia as turmas, associando alunos a disciplinas e professores.
## 2. Gerenciamento de Turmas
Atribuição de Disciplinas: Cada turma é associada a um professor e uma disciplina, permitindo a gestão de quais professores estão ministrando determinadas turmas.
Adição e Remoção de Alunos: Alunos podem ser inseridos ou removidos das turmas de acordo com a necessidade.
## 3. Registro e Gestão de Notas
Registro de Notas: Professores podem registrar duas notas parciais e uma nota de prova final (se aplicável) para os alunos de suas turmas.
Alteração de Notas: Professores podem alterar as notas de seus alunos se necessário.
## 4. Regras de Avaliação
Critério de Aprovação: Alunos precisam atingir uma média de 60 ou mais nas duas notas parciais. Caso contrário, podem realizar uma prova final, que será considerada na média final.
Prova Final: A média final é recalculada considerando a nota da prova final, se o aluno não atingiu a média mínima.
## 5. Emissão de Boletins
Boletim Individual: O sistema permite a emissão de boletins individuais contendo o nome completo do aluno, matrícula, disciplinas cursadas, notas obtidas e a situação final (Aprovado ou Reprovado).
Estrutura do Código
# Classes Principais
## Aluno: Representa os alunos no sistema, com atributos como nome e matrícula.
## Disciplina: Armazena informações sobre cada disciplina, como nome e código.
## Professor: Contém os dados dos professores.
## Turma: A classe mais complexa, gerencia a relação entre alunos, professor e disciplina, além de gerenciar as notas e emitir boletins.
## SistemaEscolar: Centraliza as operações principais do sistema, permitindo a interação com o usuário através de comandos.
## Classe Turma
A classe Turma gerencia uma turma de alunos, associando-a a uma disciplina e a um professor. Além disso, a classe é responsável pelo registro das notas dos alunos, cálculo de médias e emissão de boletins. O sistema de notas considera três valores: Nota 1, Nota 2 e, se necessário, Prova Final.

# Exemplo de funcionalidades da classe:

## adicionarAluno(Aluno aluno): Adiciona um aluno à turma.
## removerAluno(Aluno aluno): Remove um aluno da turma.
## registrarNota(Aluno aluno, int numeroNota, double nota): Registra uma nota para o aluno.
## calcularMedia(Aluno aluno): Calcula a média final do aluno, considerando as duas primeiras notas e a prova final (se aplicável).
## emitirBoletim(Aluno aluno): Emite um boletim com as notas do aluno e sua situação (Aprovado/Reprovado).
## cadastrarProfessor: Realiza o cadastro de professores por disciplinas.
## Tratamento de Exceções
O sistema trata diversas exceções, como tentativas de inserção de alunos duplicados, notas fora de faixa ou alunos inexistentes em turmas. Além disso, mensagens claras de erro são fornecidas ao usuário, ajudando na identificação de problemas.

# Como Usar
Clone o repositório para sua máquina local.
Compile e execute o código utilizando um ambiente de desenvolvimento Java (IDE ou linha de comando).
Interaja com o sistema através da interface de linha de comando para cadastrar alunos, disciplinas, professores, atribuir notas e gerar boletins.
