package entidades;

public abstract class Pessoa {
    protected String nome;
    protected String corpo;
    protected double posX, posY;

    public Pessoa(String nome, String corpo) {
        this.nome = nome;
        this.corpo = corpo;
        this.posX = 0.0;
        this.posY = 0.0;
    }

    public void movimenta(double novaPosX, double novaPosY) {
        this.posX = novaPosX;
        this.posY = novaPosY;
    }

    public String exibePosicao() {
        return this.posX + ", " + this.posY;
    }

    public abstract void falar();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}