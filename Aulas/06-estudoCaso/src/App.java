import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Endereco;
import entidades.pessoas.Medico;
import entidades.pessoas.Paciente;
import java.util.Objects; 

public class App {
    public static void main(String[] args) throws Exception {
        Paciente pac = new Paciente("jerer", "123", new Endereco(), LocalDate.of(2000, 8, 10));
        Medico med = new Medico("Jeca", "456", new Endereco(), LocalDate.of(1980, 10, 5), "12345/00");

        System.out.println(pac);
        System.out.println(med);
    }
}
