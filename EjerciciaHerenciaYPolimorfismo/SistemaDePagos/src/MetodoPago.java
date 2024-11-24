import java.time.LocalDate;

interface Cancelable{
    public void cancelarPago();
}

public abstract class MetodoPago {
    String titular;
    String numero;

    public MetodoPago(String titular, String numero){
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);
}

class TarjetaCredito extends MetodoPago implements Cancelable{

    LocalDate fechaExpiracion;
    int codigoSeguridad;

    public TarjetaCredito(String tituar,String numero, LocalDate fechaExpiracion, int codigoSeguridad){
        super(tituar,numero);
        this.fechaExpiracion = fechaExpiracion;

    }

    @Override
    public void realizarPago(double monto){
        System.out.println("¡¡Pago realizador con éxito!!");
        System.out.println("-------------------------------");
        System.out.println("Titular de la tarjeta: " + titular);
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("Monto pagado: $" + monto);
        System.out.println("-------------------------------");
    }

    @Override
    public void cancelarPago(){
        System.out.println("Pago con tarjeta de crédito cancelado.");
        System.out.println("-------------------------------");
        System.out.println("Titular de la tarjeta: " + titular);
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("-------------------------------");
    }
}

class PayPal extends MetodoPago implements Cancelable {

    String correoElectronico;

    public PayPal(String tituar,String numero,String correoElectronico){
        super(tituar,numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(double monto){
        System.out.println("Pago realizado con PayPal");
        System.out.println("-------------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Monto pagado: $" + monto);
        System.out.println("-------------------------------");
    }
    @Override
    public void cancelarPago(){
        System.out.println("Pago con PayPal cancelado.");
        System.out.println("-------------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("-------------------------------");
    }
}



}
