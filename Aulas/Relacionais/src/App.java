public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1;
        Jogador j1 = new Jogador("Mik", "c2", "FLA", "unif1", 10);

        System.out.println(j1.nome);

        System.out.println(j1.posX + ", " + j1.posY);
        j1.movimenta(10, -5);
        System.out.println(j1.posX + ", " + j1.posY);

        // Downcasting
        p1 = new Jogador("Jaula", "c3", "FLU", "uni2", 7);

        j1.falar();
    }
}
