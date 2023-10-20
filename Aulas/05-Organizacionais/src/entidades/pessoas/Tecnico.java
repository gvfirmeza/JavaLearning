package entidades.pessoas;

import entidades.Pessoa;

public class Tecnico extends Pessoa {

    public Tecnico(String nome, String corpo) {
        super(nome, corpo);
    }

    @Override
    public void falar() {
        System.out.println("Eu sou técnico.");
    }

}
