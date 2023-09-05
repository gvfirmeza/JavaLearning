public abstract class Livro {
    String nome;
    String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public abstract void reservar();

    public abstract void cancelarReserva();
}
