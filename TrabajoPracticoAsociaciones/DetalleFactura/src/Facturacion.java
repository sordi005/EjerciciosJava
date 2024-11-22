import java.util.Scanner;

public class Facturacion {
    private static final String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        // Solicitar datos de la factura
        System.out.println("Ingrese la fecha de la factura:");
        factura.setFechaFactura(scanner.nextLine());

        long numeroFactura;
        do {
            System.out.println("Ingrese el número de la factura (mayor a 0):");
            numeroFactura = scanner.nextLong();
            scanner.nextLine();
        } while (numeroFactura <= 0);
        factura.setNumeroFactura(numeroFactura);

        String cliente;
        do {
            System.out.println("Ingrese el cliente:");
            cliente = scanner.nextLine();
        } while (cliente.isEmpty());
        factura.setCliente(cliente);

        // Cargar detalles de la factura
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el código del artículo:");
            String codigo = scanner.nextLine();

            String[] articuloSeleccionado = null;
            for (String[] articulo : articulos) {
                if (articulo[0].equals(codigo)) {
                    articuloSeleccionado = articulo;
                    break;
                }
            }

            if (articuloSeleccionado == null) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            System.out.println("Ingrese la cantidad:");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            double precioUnitario = Double.parseDouble(articuloSeleccionado[2]);
            double descuento = (cantidad > 5) ? precioUnitario * 0.1 : 0;
            double subtotal = (precioUnitario - descuento) * cantidad;

            DetalleFactura detalle = new DetalleFactura(
                    articuloSeleccionado[0],
                    articuloSeleccionado[1],
                    cantidad,
                    precioUnitario,
                    descuento,
                    subtotal
            );

            factura.agregarDetalle(detalle);

            System.out.println("¿Desea continuar agregando artículos? (true/false)");
            continuar = scanner.nextBoolean();
            scanner.nextLine();
        }

        // Calcular total
        factura.calcularMontoTotal();

        // Mostrar datos de la factura
        System.out.println("\nFactura Generada:");
        System.out.println("Fecha: " + factura.getFechaFactura());
        System.out.println("Número: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Detalles:");
        System.out.println("Código  Nombre  Cantidad  Precio  Descuento  Subtotal");

        for (DetalleFactura detalle : factura.getDetallesFactura()) {
            System.out.println(detalle);
        }

        System.out.println("Total: " + factura.getTotalCalculadoFactura());
        scanner.close();
    }
}
