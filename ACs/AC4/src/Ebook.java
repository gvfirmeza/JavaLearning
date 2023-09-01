public class Ebook extends Livro {
    
    String formato;
    boolean reservado = false;

    public Ebook(String nome, String autor, String formato) {
        super(nome, autor);
        this.formato = formato;
    }

    @Override
    public void reservar() {
        if (reservado == false) {
            System.out.println("O ebook foi reservado com sucesso.");
            reservado = true;
        } else {
            System.out.println("Este ebook ja foi reservado.");
        }
        
    }

    @Override
    public void cancelarReserva() {
        if (reservado == true) {
            System.out.println("A reserva foi cancelada com sucesso.");
            reservado = false;
        } else {
            System.out.println("Este livro não está reservado.");
        }
    }
}
