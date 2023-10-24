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
            System.out.println("Erro: A matrícula já está em uso. Não é possível adicionar o aluno.");
        } else {
            alunos.put(aluno.getMatricula(), aluno);
        }
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void atualizarCursoAluno(String matricula, String novoCurso) {
        Aluno aluno = alunos.get(matricula);
        if (aluno != null) {
            aluno.setCurso(novoCurso);
            alunos.put(matricula, aluno);
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunos.get(matricula);
    }

    public void listarTodosOsAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
        }
    }
}
