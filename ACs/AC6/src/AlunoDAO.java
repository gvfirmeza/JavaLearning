import java.util.HashMap;
import java.util.Map;

public class AlunoDAO {
    private Map<String, Aluno> alunos;

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public AlunoDAO() {
        this.alunos = new HashMap<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.containsKey(aluno.getMatricula())) {
            System.out.println("\nErro: A matrícula já está em uso. Não é possível adicionar o aluno.");
        } else {
            alunos.put(aluno.getMatricula(), aluno);
        }
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void atualizarCursoAluno(String matricula, String novoCurso) {
        Aluno aluno = alunos.get(matricula);
        if (aluno != null && alunos.containsKey(aluno.getMatricula())) {
            aluno.setCurso(novoCurso);
            alunos.put(matricula, aluno);
        } else {
            System.out.println("\nErro: Não foi encontrado nenhum aluno com essa matrícula.");
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunos.get(matricula);
    }

    public void listarTodosOsAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("\nErro: Não há alunos cadastrados.");
        } else {
            System.out.println("\nTodos os alunos:\n");
            for (Aluno aluno : alunos.values()) {
                System.out.println(aluno);
            }
        }
    }

}
