public interface ITransmiteDados {
    
    // Métodos em interface são abstratos por padrão, então não é preciso explicitar.
    void enviaJson();
    String recebeMensagem(String protocolo);

}
