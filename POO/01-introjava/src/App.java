public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello");

        // Inteiros

        byte a = -50;     // 8 bits →
        short b = 15750;    // 16 bits → = -32.768 a 32.767
        int c = 1050000;      // 32 bits → padrão
        long d = 1560000L;     // 64 bits

        // Decimais

        float e = 4.85f;    //32 bits
        double f = -105.48;    //64 bits → padrão

        // Booleano

        boolean teste = true;
        teste = false;

        // Texto

        char letra = 'a'; //Uso de aspas simples. 2 bytes → Usa UNICODE
        String outroNome = "CV Barro"; // Não é um tipo de dado primitivo!

        // Type Casting

        f = (double) b;
        c = (int) e;

        // Operadores
        // Aritmético
        int x = 6;
        int y = 9;
        int z = 6;
        System.out.println(z + y);
        System.out.println(x - y);
        System.out.println(x / z);
        System.out.println(x * z);
        System.out.println(x % y);

        // Atribuição
        x += 2;
        z -= 1;
        x++;
        x--;

        // Comparação
        System.out.println(z == y);
        System.out.println(x != y);
        System.out.println(x >= z);
        System.out.println(x <= z);
        System.out.println(x > y);
        System.out.println(x < y);

        // Lógicos
        System.out.println(!false);        // NOT
        System.out.println(true && false); // AND
        System.out.println(true || false); // OR

        // Decisão
        // if-else
        int idade = 19;

        if (idade > 18) {
            System.out.println("Você é maior de idade!");
        } else if (idade < 0) {
            System.out.println("Idade Inválida");
        } else {
            System.out.println("Você é menor de idade");
        }

        // Switch
        String opção = "b";

        switch (opção) {
            case "a":
                System.out.println("Opção A");
                break;
            case "b":
                System.out.println("Opção B");
                break;
            case "C":
                System.out.println("Opção C");
                break;
            default:
                System.out.println("Opção Inválida");
        }

        // Estrutura de Repetição
        // For

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        //While
        int i = 10;
        while (i >0) {
            System.out.println(i--);
        }
    }
}
