package dao;

import java.util.HashMap;
import java.util.Map;

import entidades.Aluno;

public class AlunoDAO {
    private Map<String, Aluno> alunos;

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public AlunoDAO() {
        this.alunos = new HashMap<>();
    }

    public void adicionarAluno(Aluno aluno) {
        String matricula = aluno.getMatricula();
        if (alunos.containsKey(matricula)) {
            System.out.println("\nErro: A matrícula já está em uso. Não foi possível adicionar o aluno.");
        } else if (!matricula.matches("\\d+")) {
            System.out.println("\nErro: A matrícula deve conter apenas números. Não foi possível adicionar o aluno.");
        } else {
            alunos.put(matricula, aluno);
        }
    }

    public void removerAluno(String matricula) {
        if (alunos.containsKey(matricula)) {
            alunos.remove(matricula);
        } else {
            System.out.println("\nErro: Não foi encontrado nenhum aluno com essa matrícula.");
        }
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
