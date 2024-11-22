
import java.util.ArrayList;
import java.util.Scanner;

    public class MenuRestaurant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Plato> platosMenu = new ArrayList<>();

            System.out.println("¿Cuántos platos desea cargar?");
            int cantidadPlatos = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < cantidadPlatos; i++) {
                System.out.println("Ingrese el nombre del plato:");
                String nombrePlato = scanner.nextLine();

                System.out.println("Ingrese el precio del plato:");
                double precio = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("¿Es una bebida? (true/false):");
                boolean esBebida = scanner.nextBoolean();
                scanner.nextLine();

                Plato plato = new Plato(nombrePlato, precio, esBebida);

                if (!esBebida) {
                    System.out.println("¿Cuántos ingredientes tiene este plato? (Debe ser al menos 1)");
                    int cantidadIngredientes;
                    do {
                        cantidadIngredientes = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        if (cantidadIngredientes < 1) {
                            System.out.println("Debe ingresar al menos un ingrediente. Intente nuevamente.");
                        }
                    } while (cantidadIngredientes < 1);

                    for (int j = 0; j < cantidadIngredientes; j++) {
                        System.out.println("Ingrese el nombre del ingrediente " + (j + 1) + ":");
                        String nombreIngrediente = scanner.nextLine();

                        System.out.println("Ingrese la cantidad del ingrediente:");
                        double cantidad = scanner.nextDouble();
                        scanner.nextLine(); // Consumir el salto de línea

                        System.out.println("Ingrese la unidad de medida:");
                        String unidad = scanner.nextLine();

                        Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidad);
                        plato.agregarIngrediente(ingrediente);
                    }
                }

                platosMenu.add(plato);
            }

            // Mostrar el menú del restaurant
            System.out.println("\nMENÚ DEL RESTAURANT:");
            for (Plato plato : platosMenu) {
                System.out.println(plato);
            }

            scanner.close();
        }
    }
