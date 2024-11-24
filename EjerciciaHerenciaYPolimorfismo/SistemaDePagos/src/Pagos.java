import java.util.ArrayList;

public class Pagos {
    ArrayList<MetodoPago> metodosPago;

    public Pagos(ArrayList<MetodoPago> listaPagos){
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodoPago){
        metodosPago.add(metodoPago);
    }
    public void realizarPago(int indice, double monto){
        MetodoPago metodoPago = metodosPago.get(indice);
        metodoPago.realizarPago(monto);
    }
    public void cancelarPago(int indice){
        MetodoPago metodoPago = metodosPago.get(indice); 
        if(metodoPago instanceof Cancelable) {
            ((Cancelable) metodoPago).cancelarPago();
        } else {
            System.out.println("El método de pago no admite cancelaciones.");}
        
    }
    public void mostrarMetodosPago() {
        System.out.println("Métodos de pago disponibles:");
        for (int i = 0; i < metodosPago.size(); i++) {
            MetodoPago metodo = metodosPago.get(i);
            System.out.println(i + ": " + metodo.getClass().getSimpleName() + " - Titular: " + metodo.titular);
        }
    }
    

}
