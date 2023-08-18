import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        String msg;
        double num1;
        int num2;

        System.out.println("Digite um texto: ");
        msg = leitor.next();  //Lê input de texto
        System.out.println(msg);

        System.out.println("Digite um double: ");
        num1 = leitor.nextDouble();  //Lê input de doubles
        System.out.println(num1);

        System.out.println("Digite uma int: ");
        num2 = leitor.nextInt();  //Lê input de inteiros
        System.out.println(num2);

        leitor.close();
    }
}
