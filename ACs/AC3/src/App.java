import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        //Cadastrando Evento
        System.out.println("***************Cadastro de Evento***************");
        System.out.println("Digite nome do Evento");
        String eNome = sc.nextLine();
        System.out.println("Digite a Data do Evento");
        String eData = sc.nextLine();
        System.out.println("Digite o local do Evento");
        String eLocal = sc.nextLine();
        System.out.println("Digite as informações adicionais do Evento");
        String eInfo = sc.nextLine();
        System.out.println("Digite o máximo de participantes do Evento");
        int eMax = sc.nextInt();
        System.out.println("Digite o nome do Palestrante");
        String pNome = sc.next();

        Evento evento1;
        evento1 = new Evento(eNome, eData, eLocal, eInfo, eMax);
        System.out.println("O evento " + evento1.nome + " acontecerá no dia " + evento1.data + " no endereço " + evento1.local);
        System.out.println("O evento abrigará no máximo " + eMax + " alunos e " + eInfo);

        Palestrante palestrante1;
        palestrante1 = new Palestrante(pNome, eNome);

        //Adicionar Alunos
        
        int qtdAlunos = 0; 
        
        while(qtdAlunos <= eMax) {
            System.out.println("Para cadastrar Alunos nesse evento digite 1, para sair digite 2");
            int opc = sc.nextInt();
            if(opc == 1) {
                Aluno aluno1;
                System.out.println("Digite o nome do aluno: ");
                String aNome = sc.next();
                aluno1 = new Aluno(aNome);
                System.out.println("O aluno " + aluno1.nome + " foi cadastrado no evento " + evento1.nome);
                qtdAlunos += 1;
            } else if (opc == 2) {
                break;
            } else {
                System.out.println("Opção Inválida.");
            } 
        }

        while(true) {
            System.out.println("Para vizualizar próximas palestras digite 1, para ver quantas vagas restam digite 2, para ver palestrantes digite 3, para sair 4.");
            int op = sc.nextInt();
            if(op == 1){
                System.out.println("Próxima palestra é " + evento1.nome + " no dia" + evento1.data);
            }else if(op == 2){
                System.out.println("Ainda restaram " + (eMax - qtdAlunos) + " vagas.");
            }else if(op == 3){
                System.out.println(palestrante1.nome + " participará do evento " + palestrante1.palestra );
            }else if(op == 4){
                break;
            }
            else {
                System.out.println("Opção Inválida");
            }

        }
        

        sc.close();
    }
}
