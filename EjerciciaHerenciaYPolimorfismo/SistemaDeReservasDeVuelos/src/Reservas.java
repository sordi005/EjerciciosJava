import java.util.ArrayList;

public class Reservas {
    private ArrayList<Vuelo> vuelos;

    public Reservas() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        System.out.println("Vuelo agregado: " + vuelo.getNumeroVuelo());
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarVuelos() {
        System.out.println("Lista de vuelos reservados:");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}
