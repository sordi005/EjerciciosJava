import java.time.LocalDate;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        // Crear vuelos regulares y charters
        VueloRegular vuelo1 = new VueloRegular("R001", "Buenos Aires", "Santiago", LocalDate.of(2024, 12, 1), 150, 200);
        VueloRegular vuelo2 = new VueloRegular("R002", "Lima", "Bogotá", LocalDate.of(2024, 12, 5), 100, 180);
        VueloCharter vuelo3 = new VueloCharter("C001", "Miami", "Ciudad de México", LocalDate.of(2024, 12, 10), 50000);

        // Agregar vuelos a las reservas
        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);
        reservas.agregarVuelo(vuelo3);

        // Mostrar vuelos
        reservas.mostrarVuelos();

        // Calcular precio total antes de promociones
        System.out.println("Precio total antes de promociones: $" + reservas.calcularPrecioTotal());

        // Aplicar promociones
        reservas.aplicarPromociones();

        // Mostrar vuelos después de promociones
        reservas.mostrarVuelos();

        // Calcular precio total después de promociones
        System.out.println("Precio total después de promociones: $" + reservas.calcularPrecioTotal());
    }
}
