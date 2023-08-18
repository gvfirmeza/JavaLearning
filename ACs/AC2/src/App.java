import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        calc();
    }

    public static void calc() {
        Scanner input = new Scanner(System.in);

        String act;

        double n1;
        double n2;

        double newN;

        System.out.println("Digite um número:");
        n1 = input.nextDouble();
        
        while (true) {

            System.out.println("Escolha entre 'somar', 'diminuir', 'multiplicar', 'dividir'. Para sair digite: 'sair'. Pra limpar a operação digite 'limpar' ");
            act = input.next();
            
            if (act.equals("sair")) {
                break;
            }

            if (act.equals("limpar")) {
                System.out.println("Operação limpa");
                System.out.println("Digite um número:");
                n1 = input.nextDouble(); 
                continue;
            }

            switch (act) {
                case "somar":
                    System.out.println("Digite o segundo número:");
                    n2 = input.nextDouble();
                    newN = soma(n1,n2);
                    n1 = newN;
                    System.out.println(newN);
                    break;
                case "diminuir":
                    System.out.println("Digite o segundo número:");
                    n2 = input.nextDouble();
                    newN = sub(n1,n2);
                    n1 = newN;
                    System.out.println(newN);
                    break;
                case "multiplicar":
                    System.out.println("Digite o segundo número:");
                    n2 = input.nextDouble();
                    newN = mult(n1,n2);
                    n1 = newN;
                    System.out.println(newN);
                    break;
                case "dividir":
                    System.out.println("Digite o segundo número:");
                    n2 = input.nextDouble();
                    newN = div(n1,n2);
                    n1 = newN;
                    System.out.println(newN);
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
        }
        input.close(); 
    }

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }
    
    public static double sub(double n1, double n2) {
        return n1 - n2;
    }

    public static double mult(double n1, double n2) {
        return n1 * n2;
    }

    public static double div(double n1, double n2) {
        return n1 / n2;
    }
}
