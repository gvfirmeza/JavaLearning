public class LivroFisico extends Livro {
    
    boolean emprestado = false;
    boolean reservado = false;

    public LivroFisico(String nome, String autor) {
        super(nome, autor);
    }

    public void emprestar() {
        if(emprestado == false && reservado == true) {
            System.out.println("O livro foi emprestado com sucesso.");
            emprestado = true;
        }else if (emprestado == true) {
            System.out.println("Este livro já está emprestado.");
        } else {
            System.out.println("O livro deve ser reservado antes de emprestar.");
        }
    }

    public void devolver() {
        if(emprestado == false) {
            System.out.println("Este livro não foi emprestado, então não é possível o devolver.");
        }else {
            System.out.println("O livro foi devolvido com sucesso.");
            emprestado = false;
        }
    }

    @Override
    public void reservar() {
        if (reservado == false) {
            System.out.println("O livro foi reservado com sucesso.");
            reservado = true;
        } else {
            System.out.println("Este livro ja foi reservado.");
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
