public class SistemasDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        // Crear métodos de pago
        TarjetaCredito tarjeta = new TarjetaCredito("Juan Pérez", "1234567890123456", "12/26", "123");
        PayPal paypal = new PayPal("Ana López", "0001", "ana.lopez@example.com");

        // Agregar métodos de pago
        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        // Mostrar métodos de pago
        pagos.mostrarMetodosPago();

        // Realizar pagos
        pagos.realizarPago(0, 500.75); // Pago con tarjeta
        pagos.realizarPago(1, 150.00); // Pago con PayPal

        // Cancelar pagos
        pagos.cancelarPago(0); // Cancelar tarjeta
        pagos.cancelarPago(1); // Cancelar PayPal
    }
}