import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    // Método que imprime los clientes con facturas mayores a $500
    public static void calculatePendingInvoices(Integer customersCount, ArrayList<String> names, ArrayList<List<Integer>> invoices) {
        System.out.println("Clientes con facturas mayores a $500.");
        System.out.println("---------------------------------");

        // Recorre cada cliente y sus facturas
        for (int i = 0; i < customersCount; i++) {
            List<Integer> facturas = invoices.get(i);
            boolean tieneFacturaMayorA500 = false;

            // Verifica si el cliente tiene alguna factura mayor a $500
            for (int factura : facturas) {
                if (factura > 500) {
                    tieneFacturaMayorA500 = true;
                    break;
                }
            }

            // Si tiene facturas mayores a $500, muestra el cliente y sus facturas
            if (tieneFacturaMayorA500) {
                System.out.println("Cliente: " + names.get(i));
                System.out.println("Facturas: ");

                for (int factura : facturas) {
                    System.out.println("-- $" + factura);
                }

                System.out.println("---------------------------------");
            }
        }
    }

    // Método para contar el número de clientes
    public static int customersCount() {
        Scanner sc = new Scanner(System.in);
        int customers;
        System.out.print("Total de Clientes que va a Ingresar: ");
        customers = sc.nextInt();
        return customers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int customerCount;
        String nameCustomer;
        int countInvoices;
        int invoices;

        // Listas para almacenar nombres y facturas
        ArrayList<String> listNameCustomers = new ArrayList<>();
        ArrayList<List<Integer>> pendingInvoicesList = new ArrayList<>();

        System.out.println("""
                ----------------------------------------
                -----------Gestión de Clientes----------
                --Debes Ingresar:
                _ Cantidad de Clientes que va a guardar.
                _ Nombres de los clientes.
                _ Facturas Pendientes de los clientes.
                ----------------------------------------
                """);

        customerCount = customersCount();  // Contar clientes
        System.out.println("----------------------------------------");
        System.out.println("Ingrese Los Datos de los Clientes");

        // Captura de datos de clientes
        for (int i = 0; i < customerCount; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nameCustomer = sc.nextLine();  // Captura el nombre del cliente

            System.out.print("Cantidad De Facturas Pendientes: ");
            countInvoices = sc.nextInt();  // Captura el número de facturas

            // Crear una nueva lista de facturas para el cliente actual
            ArrayList<Integer> pendingInvoicesCustomers = new ArrayList<>();

            for (int e = 0; e < countInvoices; e++) {
                System.out.print("Monto de la factura " + (e + 1) + ": ");
                invoices = sc.nextInt();  // Captura el monto de la factura
                pendingInvoicesCustomers.add(invoices);  // Agregar la factura a la lista del cliente
            }

            // Agregar el nombre del cliente y su lista de facturas
            listNameCustomers.add(nameCustomer);
            pendingInvoicesList.add(pendingInvoicesCustomers);  // Añadir la lista de facturas del cliente

            sc.nextLine();  // Limpiar buffer antes de la siguiente entrada de nombre
            System.out.println("---------------------------------");
        }

        // Calcular e imprimir los clientes con facturas pendientes mayores a $500
        calculatePendingInvoices(customerCount, listNameCustomers, pendingInvoicesList);
    }
}


