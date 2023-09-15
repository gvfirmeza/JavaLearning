public class Jogador extends Pessoa{
    String time;
    String uniforme;
    int numCamisa;


    public Jogador(String nome, String corpo, String time, String uniforme, int numCamisa) {
        super(nome, corpo);
        this.time = time;
        this.uniforme = uniforme;
        this.numCamisa = numCamisa;
    }

    @Override
    public void movimenta(double novaPosX, double novaPosY) {
        super.movimenta(novaPosX, novaPosY);
        System.out.println("O jogador andou");
    }

    @Override
    public void falar() {
        System.out.println("Um jogador está falando!");
    }
}
