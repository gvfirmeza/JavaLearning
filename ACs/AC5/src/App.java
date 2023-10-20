public class App {
    public static void main(String[] args) throws Exception {
        crud();
    }

    public static void crud() {
        AlunoDAO crud = new AlunoDAO();

        Aluno aluno1 = new Aluno("Jaulo", "ADS", "2314");
        Aluno aluno2 = new Aluno("Cesar", "Ciência de Dados", "12777");
        Aluno aluno3 = new Aluno("Alexandre", "Engenharia", "23199");
        Aluno aluno4 = new Aluno("Mirta", "ADS", "202302");

        crud.adicionarAluno(aluno1);
        crud.adicionarAluno(aluno2);

        System.out.println("\nTodos os alunos:");
        crud.listarTodosOsAlunos();

        System.out.println("\nAdicionando 2 alunos.");
        crud.adicionarAluno(aluno3);
        crud.adicionarAluno(aluno4);

        System.out.println("\nTodos os alunos, após adição:");
        crud.listarTodosOsAlunos();

        System.out.println("\nAtualizando curso do aluno com matrícula 2314:");
        crud.atualizarCursoAluno("2314", "Ciência de Dados");
        System.out.println(crud.buscarAlunoPorMatricula("2314"));

        System.out.println("\nRemovendo aluno com matrícula 12777.");
        crud.removerAluno("12777");

        System.out.println("\nTodos os alunos, após remoção:");
        crud.listarTodosOsAlunos();
    }
}
