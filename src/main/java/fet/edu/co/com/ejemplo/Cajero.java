package fet.edu.co.com.ejemplo;

public class Cajero implements Runnable {

    private CuentaBancaria cuenta;
    private double monto;

    public Cajero(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " intenta retirar: " + monto);
            cuenta.retirar(monto);
        } catch (SaldoInsuficienteException e) {
            System.out.println(Thread.currentThread().getName() + " ERROR: " + e.getMessage());
        }
    }
}