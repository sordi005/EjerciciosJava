import java.time.LocalDate;

public abstract class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private LocalDate fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, LocalDate fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    // Método abstracto
    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, LocalDate fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion() {
        this.precioBasePorAsiento *= 0.9; // Aplica un 10% de descuento
        System.out.println("Promoción aplicada al vuelo regular " + getNumeroVuelo() + ". Nuevo precio por asiento: $" + precioBasePorAsiento);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", VueloRegular{" +
                "numeroAsientos=" + numeroAsientos +
                ", precioBasePorAsiento=" + precioBasePorAsiento +
                '}';
    }
}
class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, LocalDate fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        this.precioTotal *= 0.85; // Aplica un 15% de descuento
        System.out.println("Promoción aplicada al vuelo charter " + getNumeroVuelo() + ". Nuevo precio total: $" + precioTotal);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", VueloCharter{" +
                "precioTotal=" + precioTotal +
                '}';
    }
}
