import java.util.Scanner;
import java.io.*;

import dao.AlunoDAO;
import entidades.Aluno;

public class App {
    private static final String FILE_NAME = "alunos.txt";

    public static void main(String[] args) throws Exception {
        AlunoDAO crud = new AlunoDAO();
        carregarDados(crud, FILE_NAME);
        crudMenu(crud);
        salvarDados(crud, FILE_NAME);
    }

    private static void carregarDados(AlunoDAO crud, String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String nome = values[0];
                String curso = values[1];
                String matricula = values[2];
                crud.adicionarAluno(new Aluno(nome, curso, matricula));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void salvarDados(AlunoDAO crud, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("nome,curso,matricula\n");
            for (Aluno aluno : crud.getAlunos().values()) {
                bw.write(aluno.getNome() + "," + aluno.getCurso() + "," + aluno.getMatricula() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void crudMenu(AlunoDAO crud) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Atualizar curso do aluno");
            System.out.println("4. Listar todos os alunos");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o curso do aluno:");
                    String curso = scanner.nextLine();
                    System.out.println("Digite a matrícula do aluno:");
                    String matricula = scanner.nextLine();
                    crud.adicionarAluno(new Aluno(nome, curso, matricula));
                    break;
                case 2:
                    System.out.println("Digite a matrícula do aluno a ser removido:");
                    String matriculaRemover = scanner.nextLine();
                    crud.removerAluno(matriculaRemover);
                    break;
                case 3:
                    System.out.println("Digite a matrícula do aluno a ser atualizado:");
                    String matriculaAtualizar = scanner.nextLine();
                    System.out.println("Digite o novo curso do aluno:");
                    String novoCurso = scanner.nextLine();
                    crud.atualizarCursoAluno(matriculaAtualizar, novoCurso);
                    break;
                case 4:
                    crud.listarTodosOsAlunos();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
