package fet.edu.co.com.ejemplo;

public class SaldoInsuficienteException extends Exception {

    // Constructor vacío (opcional)
    public SaldoInsuficienteException() {
        super("Saldo insuficiente en la cuenta.");
    }

    // Constructor con mensaje personalizado
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}